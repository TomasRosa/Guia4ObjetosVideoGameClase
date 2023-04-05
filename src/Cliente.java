import java.util.ArrayList;

public class Cliente
{
    private ArrayList<Pelicula> peliculas;
    private String nombre;
    private String direccion;
    private double dni;
    public Cliente ()
    {
        this.peliculas = new ArrayList<Pelicula>();
    }
    public Cliente (String nombre, String direccion, double dni)
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

    public double getDni()
    {
        return dni;
    }

    public void setDni(double dni)
    {
        this.dni = dni;
    }
    public void agregarPeliculaDeClienteAArrayList (Pelicula pelicula)
    {
        this.peliculas.add(pelicula);
    }
}
