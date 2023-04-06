import java.time.LocalDate;
import java.util.Random;

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

        Random random = new Random();
        ///Dia minimo que me puede devolver la pelicula, dia de la fecha, actualizar desde aqui.
        int minDay = (int) LocalDate.of(2023, 4, 4).toEpochDay();
        ///Dia maximo que me puede devolver la pelicula, de dia de arriba hacia una semana, actualizar desde aqui.
        int maxDay = (int) LocalDate.of(2023, 4, 11).toEpochDay();
        ///Guardo en randomday una fecha random con los metodos de abajo.
        long randomDay =  minDay + random.nextInt(maxDay - minDay);
        ///
        this.fechaDevolucion = LocalDate.ofEpochDay(randomDay);

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

    public int devolverPelicula (Pelicula peli)
    {
        int flag = 0;
        LocalDate fechaHoy = LocalDate.now();

        if(this.getFechaDevolucion() == fechaHoy)
        {
            flag = 1;
            peli.setStock(peli.getStock() + 1);
        }
        ///Si le fecha de devolucion es igual a la fecha actual significa que hay que devolver la pelicula.
        return flag;
    }
}
