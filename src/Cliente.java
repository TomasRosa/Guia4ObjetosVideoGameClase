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
        if(pelicula.getStock() > 0)
        {
            this.peliculas.add(pelicula);
            pelicula.setStock(pelicula.getStock()-1);
            pelicula.setPopularidad(pelicula.getPopularidad()+1);
        }
        else
        {
            System.out.println("No se puede alquilar la pelicula. " + pelicula.getTitulo() + " No hay stock de la misma.");
        }
    }
    public int agregarPeliculaDeClienteAArrayListUsuario (String nombrePelicula)
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
            }
        }
        ///Si encuentra la pelicula que el usuario(consola) quiere, retorna un 1 porque existe, sino, 0.
        ///Si no hay stock de esa pelicula tambien retorna 0
        return flag;
    }
    public void mostrarUnCliente ()
    {
        System.out.println("Nombre del cliente: " + this.nombre);
        System.out.println("Direccion del cliente: " + this.direccion);
        System.out.println("DNI del cliente: " + this.dni);
    }
    public void verDatosDelClienteYPeliculasQueAlquilo ()
    {
        mostrarUnCliente();
        for(Pelicula peliculita: this.peliculas)
        {
            System.out.println("Nombre de la pelicula alquilada: " + peliculita.getTitulo());
        }
    }

}
