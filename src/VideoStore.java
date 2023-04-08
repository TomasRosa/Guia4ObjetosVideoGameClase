import java.lang.reflect.Array;
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
    public void mostrarClientesVideoStore ()
    {
        for(Cliente clientecito: this.clientes)
        {
            clientecito.mostrarUnClienteDatosYPeliculasHistorialCompleto();
        }
    }
    public Cliente corroborarQueExistaElClienteSiNoCrearlo (long dniCliente, Scanner scan)
    {
        Cliente clienteARetornar = new Cliente();

        for(Cliente clientecito: this.clientes)
        {
            if(clientecito.getDni() == dniCliente)
            {
                clienteARetornar = clientecito;
            }
        }
        if(clienteARetornar.getNombre() == null)
        {
            System.out.println("El cliente no se encuentra en la base de datos del videoStore.");
            System.out.println("Ingrese su nombre. ");
            String nombre = scan.next();
            System.out.println("Ingrese su direccion. ");
            String direccion = scan.next();
            clienteARetornar.setDireccion(direccion);
            clienteARetornar.setDni(dniCliente);
            clienteARetornar.setNombre(nombre);
        }

        return clienteARetornar;
    }
    public Boleta solicitarPelicula (Scanner scan)
    {
        Boleta boletita = new Boleta();
        char control = 's';
        Cliente clientecito = new Cliente();
        do
        {
            System.out.println("Que pelicula desea alquilar? ");
            scan.nextLine();
            String nombrePelicula = scan.nextLine();

            for(int i = 0; i < this.peliculas.size(); i++)
            {
                if (this.peliculas.get(i).getTitulo().equals(nombrePelicula))
                {
                    if(this.peliculas.get(i).getStock() == 0)
                    {
                        System.out.println("No tenemos stock de esa pelicula :(");
                    }
                    else
                    {
                        System.out.println("Ingrese el dni suyo, verificaremos en la base de datos si usted es cliente.");
                        long dni = scan.nextLong();
                        clientecito = corroborarQueExistaElClienteSiNoCrearlo(dni,scan);
                        agregarClienteAVideoStore(clientecito);

                        Pelicula peli = new Pelicula(this.peliculas.get(i).getTitulo(), this.peliculas.get(i).getDuracionEnMinutos(), this.peliculas.get(i).getClasificacionAudiencia(), this.peliculas.get(i).getSiglasPaisOrigen(), this.peliculas.get(i).getDescripcion(), this.peliculas.get(i).getGenero(), this.peliculas.get(i).getStock(), this.peliculas.get(i).getAñoLanzamiento());
                        clientecito.agregarPeliculaDeClienteAArrayList(peli);
                    }
                }
            }
            System.out.println("Desea seguir alquilando peliculas? s/n ");
            scan.nextLine();
            control = scan.next().charAt(0);
        }while (control == 's');

        boletita = new Boleta(clientecito);
        return boletita;
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
    /*
    public ArrayList<String> consultarAlquileresVigentes ()
    {
        ArrayList<String> peliculas = new ArrayList<String>();

        for(int i = 0; i < this.clientes.size(); i++)
        {
            peliculas.add(this.clientes.get(i).getPeliculas().get(i).getTitulo());
        }
        return peliculas;
    }
     */
    public ArrayList<String> consultarAlquileresVigentes()
    {
        ArrayList<String> peliculas = new ArrayList<String>();

        for (int i = 0; i < this.clientes.size(); i++)
        {
            ArrayList<Pelicula> peliculasAlquiladas = this.clientes.get(i).getPeliculas();

            for (int j = 0; j < peliculasAlquiladas.size(); j++)
            {
                peliculas.add(peliculasAlquiladas.get(j).getTitulo());
            }
        }
        return peliculas;
    }

    public ArrayList<Pelicula> ordenarPorPopularidadMetodoBurbuja()
    {
        ArrayList<Pelicula> peliculasOrdenadas = new ArrayList<Pelicula>(this.peliculas); ///Copio el arreglo de this.peliculas en el nuevo arreglo creado
        int n = peliculasOrdenadas.size(); /// n es igual a la cantidad de peliculas que hay.
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (peliculasOrdenadas.get(j).getPopularidad() < peliculasOrdenadas.get(j + 1).getPopularidad())
                {
                    // Intercambiar elementos
                    Pelicula temp = peliculasOrdenadas.get(j);
                    peliculasOrdenadas.set(j, peliculasOrdenadas.get(j + 1));
                    peliculasOrdenadas.set(j + 1, temp);
                }
            }
        }
        return peliculasOrdenadas;
    }
    public ArrayList<Pelicula> ordenarPorPopularidadMetodoBurbujaGenero(ArrayList<Pelicula> aCopiar)
    {
        ///Copio el arreglo de this.peliculas en el nuevo arreglo creado
        int n = aCopiar.size(); /// n es igual a la cantidad de peliculas que hay.
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (aCopiar.get(j).getPopularidad() < aCopiar.get(j + 1).getPopularidad())
                {
                    // Intercambiar elementos
                    Pelicula temp = aCopiar.get(j);
                    aCopiar.set(j, aCopiar.get(j + 1));
                    aCopiar.set(j + 1, temp);
                }
            }
        }
        return aCopiar;
    }
    public void buscarPorGeneroYOrdenarlosSegunPopularidad (String genero)
    {
        ArrayList<Pelicula> mostrarPeliculas = new ArrayList<Pelicula>();
        ArrayList<Pelicula> aCopiar = new ArrayList<Pelicula>();

        for(Pelicula buscarPorGenero: this.peliculas)
        {
            if(genero.equals(buscarPorGenero.getGenero()))
            {
                aCopiar.add(buscarPorGenero);
            }
        }
        aCopiar = ordenarPorPopularidadMetodoBurbujaGenero(aCopiar);
        mostrarArrayListPeliculas(aCopiar);
    }
    public void mostrarArrayListPeliculas (ArrayList<Pelicula> peliculas)
    {
        for(int i = 0; i < peliculas.size(); i++)
        {
            peliculas.get(i).mostrarPelicula();
        }
    }

    public void verInformacionDetalladaPelicula (String nombrePelicula)
    {
        for(Pelicula buscarPeli: this.peliculas)
        {
            if(buscarPeli.getTitulo().equals(nombrePelicula))
            {
                buscarPeli.mostrarPelicula();
            }
        }
    }
    public void consultarUltimosDiezAlquileresClientes2()
    {
        for (Cliente cliente : this.clientes)
        {
            ///Guardo las peliculas del cliente en un arrayList de peliculas
            ArrayList<Pelicula> peliculasAlquiladas = cliente.getPeliculas();
            ///Guardo el total de peliculas del cliente en un entero.
            int numPeliculasAlquiladas = peliculasAlquiladas.size();
            ///Imprimo el nombre del cliente
            System.out.println("Cliente: " + cliente.getNombre());
            ///Math.min me devuelve el valor mas pequeño entre el total de mis peliculas alquiladas del cliente y 10 que es el maximo que se pueden ver
            ///Segun la consigna, entonces para ver las diez ultimas utilizo mathmin
            int numPeliculas = Math.min(numPeliculasAlquiladas, 2);
            ///Bucle
            for (int i = numPeliculasAlquiladas - 1; i >= numPeliculasAlquiladas - numPeliculas; i--)
            {
                    System.out.println(peliculasAlquiladas.get(i).getTitulo());
            }
        }
        }
}
