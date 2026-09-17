import java.util.Scanner;
import java.util.Stack;

public class menu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<ObjReserva> reserva = new Stack<>();
        metodos m = new metodos();
        ObjReserva o = new ObjReserva();
        String bReserva = "", cReserva = "";
        boolean continuar = true;

        while (continuar) {
            System.out.println("Bienvenido al hotel los recuerdos.");
            System.out.println("Ingrese la opcion que desea realizar");
            System.out.println("1) Registrar una reserva");
            System.out.println("2) Cancelar la ultima reserva");
            System.out.println("3) Consultar la ultima reserva");
            System.out.println("4) Mostrar todas las reservas");
            System.out.println("5) Buscar una reserva por codigo");
            System.out.println("6) Contar cuantas reservas pertenecen a una determinada habitacion");
            System.out.println("7) Salir");
            int opt = m.ValidarEentero(sc);

            switch (opt) {
                case 1:
                    reserva = m.Registrar(reserva, sc, m);
                    break;
                case 2:
                    reserva = m.cancelarUltimaReserva(reserva, sc);
                    break;
                case 3:
                    m.ultimaReserva(reserva, sc);
                    break;
                case 4:
                    m.reservas(reserva, sc);
                    break;
                case 5:
                    System.out.println(m.buscarReserva(reserva, sc, bReserva));
                    break;
                case 6:
                    System.out.println(m.contarReservas(reserva, sc, bReserva, m, cReserva));
                    break;
                case 7:
                    System.out.println("Gracias por visitarnos");
                    continuar = false;
                    break;

                default:
                    System.out.println("Esa opcion no existe");
                    break;
            }
        }
    }
}