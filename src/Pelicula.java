public class Pelicula
{
    private String titulo;
    private int añoLanzamiento;
    private int duracionEnMinutos;
    private String clasificacionAudiencia;
    private String siglasPaisOrigen;
    private String descripcion;
    private String genero;
    private int stock;
    private int popularidad = 0; ///Cuantas veces se llevo esa pelicula, inicia en 0 por defecto.


    public Pelicula ()
    {

    }
    public Pelicula (String titulo, int duracionEnMinutos,String clasificacionAudiencia, String siglasPaisOrigen,String descricpcion,String genero,int stock, int añoLanzamiento)
    {
        this.titulo = titulo;
        this.duracionEnMinutos = duracionEnMinutos;
        this.clasificacionAudiencia = clasificacionAudiencia;
        this.siglasPaisOrigen = siglasPaisOrigen;
        this.descripcion = descricpcion;
        this.genero = genero;
        this.stock = stock;
        this.añoLanzamiento = añoLanzamiento;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    public int getAñoLanzamiento()
    {
        return añoLanzamiento;
    }

    public void setAñoLanzamiento(int añoLanzamiento)
    {
        this.añoLanzamiento = añoLanzamiento;
    }

    public int getDuracionEnMinutos()
    {
        return duracionEnMinutos;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos)
    {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public String getClasificacionAudiencia()
    {
        return clasificacionAudiencia;
    }

    public void setClasificacionAudiencia(String clasificacionAudiencia)
    {
        this.clasificacionAudiencia = clasificacionAudiencia;
    }

    public String getSiglasPaisOrigen()
    {
        return siglasPaisOrigen;
    }

    public void setSiglasPaisOrigen(String siglasPaisOrigen)
    {
        this.siglasPaisOrigen = siglasPaisOrigen;
    }

    public String getDescripcion()
    {
        return descripcion;
    }

    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }

    public String getGenero()
    {
        return genero;
    }

    public void setGenero(String genero)
    {
        this.genero = genero;
    }

    public int getStock()
    {
        return stock;
    }

    public void setStock(int stock)
    {
        this.stock = stock;
    }

    public int getPopularidad()
    {
        return popularidad;
    }

    public void setPopularidad(int popularidad)
    {
        this.popularidad = popularidad;
    }
    public void mostrarPelicula ()
    {
        System.out.println("**********************************************************");
        System.out.println("Titulo de la pelicula: " + this.titulo);
        System.out.println("Año de lanzamiento: " + this.añoLanzamiento);
        System.out.println("Duracion en minutos de la pelicula: " + this.duracionEnMinutos);
        System.out.println("Clasificacion de la audiencia: " + this.clasificacionAudiencia);
        System.out.println("Siglas del pais de origen de la pelicula: " + this.siglasPaisOrigen);
        System.out.println("Descricpion de la pelicula: " + this.descripcion);
        System.out.println("Genero de la pelicula: " + this.genero);
        System.out.println("Stock de la pelicula: " + this.stock);
        System.out.println("Cantidad de veces que la pelicula fue alquilada: " + this.popularidad);
        System.out.println("**********************************************************");
    }
}
