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
}
