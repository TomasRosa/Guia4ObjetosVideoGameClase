public class AlquilerVigente
{
    private String nombrePeli;
    private long dni;
    private String nombreCliente;

    public AlquilerVigente()
    {

    }
    public AlquilerVigente (String nombrePeli, long dni, String nombreCliente)
    {
        this.nombrePeli = nombrePeli;
        this.nombreCliente = nombreCliente;
        this.dni = dni;
    }
    public void mostrarAlquilerVigente ()
    {
        System.out.println("***************************************");
        System.out.println("Nombre de pelicula: " + this.nombrePeli);
        System.out.println("Nombre de cliente: " + this.nombreCliente);
        System.out.println("DNI: " + this.dni);
        System.out.println("***************************************");
    }

    public String getNombrePeli()
    {
        return nombrePeli;
    }

    public void setNombrePeli(String nombrePeli)
    {
        this.nombrePeli = nombrePeli;
    }

    public long getDni()
    {
        return dni;
    }

    public void setDni(long dni)
    {
        this.dni = dni;
    }

    public String getNombreCliente()
    {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente)
    {
        this.nombreCliente = nombreCliente;
    }
}
