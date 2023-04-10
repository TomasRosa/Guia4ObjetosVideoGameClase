import java.util.ArrayList;
public class Cliente
{
    private ArrayList<Pelicula> peliculas;
    private ArrayList<Boleta> boletas;
    private String nombre;
    private String direccion;
    private long dni;
    public Cliente ()
    {
        this.peliculas = new ArrayList<Pelicula>();
        this.boletas = new ArrayList<Boleta>();
    }
    public Cliente (String nombre, String direccion, long dni)
    {
        this.peliculas = new ArrayList<Pelicula>();
        this.boletas = new ArrayList<Boleta>();
        this.nombre = nombre;
        this.direccion = direccion;
        this.dni = dni;
    }

    public ArrayList<Boleta> getBoletas()
    {
        return boletas;
    }

    public void setBoletas(ArrayList<Boleta> boletas)
    {
        this.boletas = boletas;
    }

    public void agregarBoletaAArrayList (Boleta boleta)
    {
        this.boletas.add(boleta);
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
        pelicula.setStock(pelicula.getStock()-1);
        this.peliculas.add(pelicula);
    }
    public void mostrarUnClienteSoloUltimosDiez ()
    {
        System.out.println("**********************************");
        System.out.println("Nombre del cliente: " + this.nombre);
        System.out.println("Direccion del cliente: " + this.direccion);
        System.out.println("DNI del cliente: " + this.dni);
        System.out.println("Peliculas que lleva el cliente: ");
        System.out.println("**********************************");
        for(int i = 0; i < 10; i++)
        {
            System.out.println(this.peliculas.get(i).getTitulo());
        }
        System.out.println("**********************************");
    }
    public void mostrarUnClienteDatosYPeliculasHistorialCompleto ()
    {
        System.out.println("**********************************");
        System.out.println("Nombre del cliente: " + this.nombre);
        System.out.println("Direccion del cliente: " + this.direccion);
        System.out.println("DNI del cliente: " + this.dni);
        System.out.println("Peliculas que lleva el cliente: ");
        for(int i = 0; i < this.peliculas.size(); i++)
        {
            System.out.println(this.peliculas.get(i).getTitulo());
        }
        System.out.println("**********************************");
    }
}
