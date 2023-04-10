import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Boleta
{
    private Cliente cliente;
    private LocalDate fechaRetiro; ///Va a ser hoy
    private LocalDate fechaDevolucion; ///Fecha random puede ser solo de aqui a una semana.
    Random random = new Random();
    long numeroDeBoleta = random.nextLong(1000000000);

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
        System.out.println("Nª de boleta: " + this.numeroDeBoleta);
        this.cliente.mostrarUnClienteDatosYPeliculasHistorialCompleto();
    }

}
