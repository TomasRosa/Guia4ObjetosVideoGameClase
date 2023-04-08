import java.util.ArrayList;

public class Cliente
{
    private ArrayList<Pelicula> peliculas;
    private String nombre;
    private String direccion;
    private long dni;
    public Cliente ()
    {
        this.peliculas = new ArrayList<Pelicula>();
    }
    public Cliente (String nombre, String direccion, long dni)
    {
        this.peliculas = new ArrayList<Pelicula>();
        this.nombre = nombre;
        this.direccion = direccion;
        this.dni = dni;
    }

    public ArrayList<Pelicula> getPeliculas()
    {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas)
    {
        this.peliculas = peliculas;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getDireccion()
    {
        return direccion;
    }

    public void setDireccion(String direccion)
    {
        this.direccion = direccion;
    }

    public long getDni()
    {
        return dni;
    }

    public void setDni(long dni)
    {
        this.dni = dni;
    }
    public void agregarPeliculaDeClienteAArrayList (Pelicula pelicula)
    {
        pelicula.setPopularidad(pelicula.getPopularidad()+1);
        this.peliculas.add(pelicula);
    }
    public void mostrarUnCliente ()
    {
        System.out.println("Nombre del cliente: " + this.nombre);
        System.out.println("Direccion del cliente: " + this.direccion);
        System.out.println("DNI del cliente: " + this.dni);
    }
    public void verDatosDelClienteYUltimas10PeliculasQueAlquilo ()
    {
        for(int i = 0; i < this.peliculas.size(); i++)
        {
            mostrarUnCliente();
            System.out.println("Nombre de la pelicula alquilada: " + this.peliculas.get(i).getTitulo());
        }
    }


}
