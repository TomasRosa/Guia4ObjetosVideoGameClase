import java.util.ArrayList;
import java.util.Scanner;

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
    public Cliente corroborarQueExistaElCliente (long dniCliente)
    {
        Cliente clienteARetornar = new Cliente();

        ///Si existe el cliente lo retorna, sino retorna un cliente sin nada, igualmente lo voy a crear.

        for(Cliente clientecito: this.clientes)
        {
            if(clientecito.getDni() == dniCliente)
            {
                clienteARetornar = clientecito;
            }
        }
        ///Si el cliente existe tengo que instanciar una boleta con los datos del cliente, fecha de retiro (dia de hoy) fecha de devolucion (algun dia entre hoy y una semana)
        ///Si no existe debo cargar los datos del nuevo cliente y generar boleta con lo mismo de arriba.
        return clienteARetornar;
    }
    public int solicitarPelicula (String nombrePelicula, Scanner scan)
    {
        ///Para que esto funcione verificar el retorno de la flag cuando se la llame en el main.
        int flag = 0;

        for(Pelicula nombrePeli: this.peliculas)
        {
            if(nombrePeli.equals(nombrePelicula))
            {
                flag = 1;
                if(nombrePeli.getStock() == 0)
                {
                    flag = 0;
                }
                else
                {
                    Cliente clientecito = new Cliente();

                    System.out.println("Ingrese el dni suyo, verificaremos en la base de datos si usted es cliente.");
                    long dni = scan.nextLong();

                    clientecito = corroborarQueExistaElCliente(dni);
                    if(clientecito.getDni() != 0L) ///Si el cliente fue encontrado
                    {
                        nombrePeli.setStock(nombrePeli.getStock()-1);
                        nombrePeli.setPopularidad(nombrePeli.getPopularidad()+1);
                        Pelicula peli = new Pelicula(nombrePeli.getTitulo(),nombrePeli.getDuracionEnMinutos(),nombrePeli.getClasificacionAudiencia(),nombrePeli.getSiglasPaisOrigen(),nombrePeli.getDescripcion(),nombrePeli.getGenero(),nombrePeli.getStock(),nombrePeli.getAñoLanzamiento());
                        clientecito.agregarPeliculaDeClienteAArrayList(peli);

                        Boleta boletita = new Boleta(clientecito);
                    }
                    else ///Si el cliente no existe
                    {
                        System.out.println("Usted no esta inscripto en la base de datos.");
                        System.out.println("Ingrese su nombre.");
                        String nombre = scan.next();
                        System.out.println("Ingrese su direccion. ");
                        String direccion = scan.next();
                        System.out.println("Ingrese su dni. ");
                        dni = scan.nextLong();

                        clientecito.setNombre(nombre);
                        clientecito.setDni(dni);
                        clientecito.setDireccion(direccion);

                        nombrePeli.setStock(nombrePeli.getStock()-1);
                        nombrePeli.setPopularidad(nombrePeli.getPopularidad()+1);
                        Pelicula peli = new Pelicula(nombrePeli.getTitulo(),nombrePeli.getDuracionEnMinutos(),nombrePeli.getClasificacionAudiencia(),nombrePeli.getSiglasPaisOrigen(),nombrePeli.getDescripcion(),nombrePeli.getGenero(),nombrePeli.getStock(),nombrePeli.getAñoLanzamiento());
                        clientecito.agregarPeliculaDeClienteAArrayList(peli);

                        Boleta boletita = new Boleta(clientecito);
                    }
                }
            }
            else if(nombrePeli.equals(nombrePelicula) == false)
            {
                flag = 0;
            }
        }
        ///Si encuentra la pelicula que el usuario quiere REALIZA UNA BANDA DE COSAS RETORNA 1.
        ///Si no hay stock de esa pelicula o no existe, retorna 0.
        return flag;
    }
    public Pelicula encuentraPeliculaRetorna (String nombrePelicula)
    {
        Pelicula peli = new Pelicula();

        for(Pelicula nombrePeli: this.peliculas)
        {
            if(nombrePeli.equals(nombrePelicula))
            {
                peli.setTitulo(nombrePeli.getTitulo());///Preguntar chat gpt
                peli.setAñoLanzamiento(nombrePeli.getAñoLanzamiento());
                peli.setDuracionEnMinutos(nombrePeli.getDuracionEnMinutos());
                peli.setClasificacionAudiencia(nombrePeli.getClasificacionAudiencia());
                peli.setSiglasPaisOrigen(nombrePeli.getSiglasPaisOrigen());
                peli.setDescripcion(nombrePeli.getDescripcion());
                peli.setGenero(nombrePeli.getGenero());
                peli.setStock(nombrePeli.getStock());
                peli.setPopularidad(nombrePeli.getPopularidad());
            }
        }
       return peli;
    }
}