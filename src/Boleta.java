import java.time.LocalDate;
import java.util.ArrayList;

public class Boleta
{
    private Cliente cliente;
    private LocalDate fechaRetiro; ///Va a ser hoy
    private LocalDate fechaDevolucion; ///Fecha random puede ser solo de aqui a una semana.


    public Boleta()
    {

    }
    public Boleta (Cliente cliente)
    {
        this.fechaRetiro = LocalDate.now();

        int dia = LocalDate.now().getDayOfMonth(); //Se decidio que haya tiempo para devolverla dentro de una semana.
        ///this.fechaDevolucion = (LocalDate.of(LocalDate.now().getYear(), LocalDate.now().getMonth(), dia+7));
        ///this.fechaDevolucion = LocalDate.now();
        this.fechaDevolucion = LocalDate.now();
        this.cliente = cliente;
    }

    public Cliente getCliente()
    {
        return cliente;
    }

    public void setCliente(Cliente cliente)
    {
        this.cliente = cliente;
    }

    public LocalDate getFechaRetiro()
    {
        return fechaRetiro;
    }

    public void setFechaRetiro(LocalDate fechaRetiro)
    {
        this.fechaRetiro = fechaRetiro;
    }

    public LocalDate getFechaDevolucion()
    {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion)
    {
        this.fechaDevolucion = fechaDevolucion;
    }

    public void devolverPelicula ()
    {
        ArrayList<Pelicula> peliculasAlquiladas = this.cliente.getPeliculas();


        if(LocalDate.now() == this.fechaDevolucion)
        {

        }
        else
        {
            System.out.println("No es tiempo de devolver la pelicula. ");
        }
        ///Si le fecha de devolucion es igual a la fecha actual significa que hay que devolver la pelicula.
    }
    public ArrayList<Cliente> consultarDevolucionesHoy (VideoStore TiendaCompleta)
    {
        ArrayList<Cliente> clientesConPeliculasADevolver = new ArrayList<Cliente>();

        for(Cliente clientecito: TiendaCompleta.getClientes())
        {
            ArrayList<Pelicula> peliculasADevolver = new ArrayList<Pelicula>();
           for(Pelicula peliculaADevolver: clientecito.getPeliculas())
           {
                if(LocalDate.now().isEqual(this.fechaDevolucion))
                {
                    System.out.println("El cliente: " + clientecito.getNombre() + "debe devolver la pelicula: " + peliculaADevolver.getTitulo());
                    clientesConPeliculasADevolver.add(clientecito);
                }
           }
        }
        return clientesConPeliculasADevolver;
    }
    public void mostrarBoleta ()
    {
        System.out.println("*******BOLETA*******");
        System.out.println("Fecha de retiro: " + this.fechaRetiro);
        System.out.println("Fecha de devolucion: " + this.fechaDevolucion);
        this.cliente.mostrarUnClienteDatosYPeliculasHistorialCompleto();
    }
}
