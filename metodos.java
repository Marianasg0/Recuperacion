import java.util.Scanner;
import java.util.Stack;

public class metodos {

    public Stack<ObjReserva> Registrar(Stack<ObjReserva> reserva, Scanner sc, metodos m) {
        boolean continuar = true;
        while (continuar) {
            ObjReserva o = new ObjReserva();
            System.out.println("Ingrese el codigo");
            o.setCodigo(sc.next());
            System.out.println("Ingrese el nombre del cliente");
            o.setNombreCliente(sc.next());
            System.out.println("Ingrese la habitacion");
            o.setHabitacion(sc.nextInt());
            System.out.println("Ingrese la fecha de entrada");
            o.setFechaEntrada(sc.next());
            System.out.println("Ingrese la fecha de salida");
            o.setFechaSalida(sc.next());
            reserva.push(o);
            System.out.println("Desea registrar otra reserva 1)Si 2)No");
            int opt = m.ValidarEentero(sc);
            if (opt == 2) {
                continuar = false;
            }
        }
        return reserva;
    }

    public int ValidarEentero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println(
                    "Ingrese un numero entero ");
            sc.next();
        }
        return sc.nextInt();
    }

    public Stack<ObjReserva> cancelarUltimaReserva(Stack<ObjReserva> reserva, Scanner sc) {
        if (!reserva.isEmpty()) {
            reserva.pop();
            System.out.println("Ultima reserva eliminada");
        } else {
            System.out.println("No hay reservas para eliminar");
        }
        return reserva;
    }

    public void ultimaReserva(Stack<ObjReserva> reserva, Scanner sc) {
        if (!reserva.isEmpty()) {
            ObjReserva ultima = reserva.peek();
            System.out.println("Ultima reserva: ");
            System.out.println("Codigo: " + ultima.getCodigo());
            System.out.println("Nombre Cliente: " + ultima.getNombreCliente());
            System.out.println("Habitacion: " + ultima.getHabitacion());
            System.out.println("Fecha entrada: " + ultima.getFechaEntrada());
            System.out.println("Fecha salida: " + ultima.getFechaSalida());
        } else {
            System.out.println("No hay reservas para visualizar");
        }
    }

    public void reservas(Stack<ObjReserva> reserva, Scanner sc) {
        if (!reserva.isEmpty()) {
            for (ObjReserva o : reserva) {
                System.out.println("Codigo: " + o.getCodigo());
                System.out.println("Nombre Cliente: " + o.getNombreCliente());
                System.out.println("Habitacion: " + o.getHabitacion());
                System.out.println("Fecha entrada: " + o.getFechaEntrada());
                System.out.println("Fecha salida: " + o.getFechaSalida());
                System.out.println("------------------------------------------");
            }
        } else {
            System.out.println("No hay reservas para mostrar");
        }
    }

    public String buscarReserva(Stack<ObjReserva> reserva, Scanner sc, String bReserva) {
        if (!reserva.isEmpty()) {
            System.out.println("Ingrese el codigo de la reserva a buscar");
            String codigo = sc.next();
            for (ObjReserva o : reserva) {
                if (o.getCodigo().equalsIgnoreCase(codigo)) {
                    System.out.println("Reserva encontrada:");
                    System.out.println("Codigo: " + o.getCodigo());
                    System.out.println("Nombre Cliente: " + o.getNombreCliente());
                    System.out.println("Habitacion: " + o.getHabitacion());
                    System.out.println("Fecha entrada: " + o.getFechaEntrada());
                    System.out.println("Fecha salida: " + o.getFechaSalida());
                }
            }
        } else {
            System.out.println("No hay reservas para buscar");
        }
        return bReserva;
    }

    public String contarReservas(Stack<ObjReserva> reserva, Scanner sc, String bReserva, metodos m, String cReserva) {
        if (!reserva.isEmpty()) {
            int cont = 0;
            System.out.println("Ingrese la habitacion a la cual le desea contar las reservas");
            int habitacion = m.ValidarEentero(sc);
            for (ObjReserva o : reserva) {
                if (o.getHabitacion() == habitacion) {
                    cont++;
                }
            }
            System.out.println("La cantidad de reservas que tiene la habitacion " + habitacion + " es: " + cont);
        } else {
            System.out.println("No hay reservas para contar");
        }
        return cReserva;
    }

}