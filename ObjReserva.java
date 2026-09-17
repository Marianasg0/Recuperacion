public class ObjReserva {

    String Codigo;
    String NombreCliente;
    int Habitacion;
    String FechaEntrada;
    String FechaSalida;

    public ObjReserva() {
    }

    public ObjReserva(String codigo, String nombreCliente, int habitacion, String fechaEntrada, String fechaSalida) {
        Codigo = codigo;
        NombreCliente = nombreCliente;
        Habitacion = habitacion;
        FechaEntrada = fechaEntrada;
        FechaSalida = fechaSalida;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        NombreCliente = nombreCliente;
    }

    public int getHabitacion() {
        return Habitacion;
    }

    public void setHabitacion(int habitacion) {
        Habitacion = habitacion;
    }

    public String getFechaEntrada() {
        return FechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        FechaEntrada = fechaEntrada;
    }

    public String getFechaSalida() {
        return FechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        FechaSalida = fechaSalida;
    }

}
