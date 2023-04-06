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
    public void mostrarPeliculasVideoStore ()
    {
        for(Pelicula peliculas: this.peliculas)
        {
            peliculas.mostrarPelicula();
        }
    }
    public int corroborarQueExistaElCliente (long dniCliente)
    {
        int flag = 0;
        ///Para que esto funcione verificar el retorno de la flag cuando se la llame en el main.
        for(Cliente clientecito: this.clientes)
        {
            if(clientecito.getDni() == dniCliente)
            {
                flag = 1;
            }
        }
        ///Si el cliente existe tengo que instanciar una boleta con los datos del cliente, fecha de retiro (dia de hoy) fecha de devolucion (algun dia entre hoy y una semana)
        ///Si no existe debo cargar los datos del nuevo cliente y generar boleta con lo mismo de arriba.
        return flag;
    }
}