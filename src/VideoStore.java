import java.util.ArrayList;

public class VideoStore
{
    private ArrayList<Cliente> clientes;
    private ArrayList<Pelicula> peliculas;

    public VideoStore ()
    {
        this.clientes = new ArrayList<Cliente>();
        this.peliculas = new ArrayList<Pelicula>();
    }

    public ArrayList<Cliente> getClientes()
    {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes)
    {
        this.clientes = clientes;
    }

    public ArrayList<Pelicula> getPeliculas()
    {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas)
    {
        this.peliculas = peliculas;
    }
    public void agregarPeliculaAVideoStore (Pelicula pelicula)
    {
        this.peliculas.add(pelicula);
    }
    public void agregarClienteAVideoStore (Cliente cliente)
    {
        this.clientes.add(cliente);
    }
}