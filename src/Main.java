import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        manejarSistema();

    }
    public static void manejarSistema ()
    {
        VideoStore TiendaDeVideo = new VideoStore();
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese que desea hacer: ");
        System.out.println("(1) Ver informacion de todas las peliculas antes de ser alquiladas por los clientes. ");
        System.out.println("(2) Ver informacion de todas las peliculas luego de ser alquiladas por los clientes de nuestra base de datos. ");
        System.out.println("(3) Ver informacion de todos los clientes de nuestra base de datos. ");
        System.out.println("(4) Solicitar alquilar peliculas. ");
        System.out.println("(5) Devolver pelicula. CONSULTAR");
        System.out.println("(6) Consultar alquileres vigentes. ");
        System.out.println("(7) Consultar devoluciones que deberian hacerse hoy. CONSULTAR ");
        System.out.println("(8) Consultar ultimos diez alquileres de cada cliente. ");
        System.out.println("(9) Consultar los titulos mas alquilados");
        System.out.println("(10) Consultar los titulos mas alquilados de un genero");
        System.out.println("(11) Consultar informacion detallada de un determinado titulo. ");
        int opcion = scan.nextInt();

        switch (opcion)
        {
            case 1:
            {
                llenarBaseDeDatosPeliculas(TiendaDeVideo);
                System.out.println("PELICULAS ANTES DE SER ALQUILADAS POR LOS CLIENTES: ");
                TiendaDeVideo.mostrarPeliculasVideoStore();
                break;
            }
            case 2:
            {
                llenarBaseDeDatosClientes(TiendaDeVideo);
                System.out.println("PELICULAS LUEGO DE SER ALQUILADAS POR LOS CLIENTES. ");
                TiendaDeVideo.mostrarPeliculasVideoStore();
                break;
            }
            case 3:
            {
                llenarBaseDeDatosClientes(TiendaDeVideo);
                TiendaDeVideo.mostrarClientesVideoStore();
                break;
            }
            case 4:
            {
                llenarBaseDeDatosClientes(TiendaDeVideo);
                Boleta boletita = new Boleta();

                boletita = TiendaDeVideo.solicitarPelicula(scan);

                System.out.println("Boleta del cliente: ");

                boletita.mostrarBoleta();
                break;
            }
            case 5:
            {
                ///gestionarDevolucion(TiendaDeVideo);
                ///PREGUNTAR A GUILLE O A CUALQUEIR AYUDANTE O NOSE
                System.out.println("PREGUNTAR");
                break;
            }
            case 6:
            {
                llenarBaseDeDatosClientes(TiendaDeVideo);
                System.out.println("Alguileres vigentes: ");
                ArrayList<String> consultar = TiendaDeVideo.consultarAlquileresVigentes();
                for(int i = 0; i < consultar.size(); i++)
                {
                    System.out.println(consultar.get(i));
                }
                break;
            }
            case 7:
            {
                System.out.println("DEJAR PARA CLASE O AYUDA COMPAÑERO");
            }
            case 8:
            {
                llenarBaseDeDatosClientes(TiendaDeVideo);
                System.out.println("Ultimos diez alquileres de cada cliente: ");
                TiendaDeVideo.consultarUltimosDiezAlquileresClientes2();
                break;
            }
            case 9:
            {
                llenarBaseDeDatosClientes(TiendaDeVideo);
                System.out.println("Titulos mas alquilados de mayor a menor: ");
                ArrayList<Pelicula> peliculas =  TiendaDeVideo.ordenarPorPopularidadMetodoBurbuja();
                for(int i = 0; i < peliculas.size(); i++)
                {
                    peliculas.get(i).mostrarPelicula();
                }
                break;
            }
            case 10:
            {
                llenarBaseDeDatosClientes(TiendaDeVideo);
                System.out.println("Ingrese el genero del que desea ver los mas alquilados");
                scan.nextLine();
                String genero = scan.nextLine();

                TiendaDeVideo.buscarPorGeneroYOrdenarlosSegunPopularidad(genero);
                break;
            }
            case 11:
            {
                llenarBaseDeDatosClientes(TiendaDeVideo);
                System.out.println("Ingrese el nombre de la pelicula que desea ver informacion. ");
                scan.nextLine();
                String nombre = scan.nextLine();

                TiendaDeVideo.verInformacionDetalladaPelicula(nombre);
            }

        }
    }
    public static void llenarBaseDeDatosPeliculas(VideoStore TiendaDeVideo)
    {
        Pelicula peli = new Pelicula("John Wick",101,"R","USA","Un exasesino busca venganza contra un grupo de gángsters que mataron a su perro.","Accion",15,2014);
        Pelicula peli2 = new Pelicula ("Mad Max: Fury Road",120,"R","AUS/USA","Un guerrero postapocalíptico ayuda a un grupo de mujeres a escapar de un líder opresor.","Accion",21,2015);

        Pelicula peli3 = new Pelicula("Indiana Jones and the Raiders of the Lost Ark",115,"PG","USA","El arqueólogo Indiana Jones busca el Arca de la Alianza antes de que caiga en manos nazis.","Aventura",26,1981);
        Pelicula peli4 = new Pelicula("The Lord of the Rings: The Fellowship of the Ring",178,"PG","NZ/USA","Un grupo de aventureros emprende una peligrosa misión para destruir un anillo que amenaza con destruir el mundo.","Aventura",7,2001);

        Pelicula peli5 = new Pelicula("The Hangover",100,"R","USA","Un grupo de amigos despiertan después de una noche de desenfreno en Las Vegas sin recordar nada de lo sucedido.","Comedia",12,2009);
        Pelicula peli6 = new Pelicula("Bridesmaids",125, "R", "USA","Una dama de honor intenta hacer frente a la caótica boda de su mejor amiga.","Comedia",26,2011);

        Pelicula peli7 = new Pelicula("The Shawshank Redemption",142,"R","USA","Un banquero es encarcelado por asesinato y lucha por su supervivencia en la prisión de Shawshank.","Drama",11,1994);
        Pelicula peli8 = new Pelicula("The Godfather",175,"R","USA","La historia épica de la familia Corleone y su lucha por el poder en el mundo del crimen organizado","Drama",17,1972);

        Pelicula peli9 = new Pelicula("The Exorcist",122,"R","USA","Una madre lucha por salvar a su hija poseída por una entidad demoníaca.","Horror",18,1973);
        Pelicula peli10= new Pelicula("The Conjuring",112,"R","USA","Una pareja de investigadores paranormales ayuda a una familia a lidiar con una presencia maligna en su casa.","Horror",23,2013);

        Pelicula peli11 = new Pelicula("Blackfish",83,"PG-13","USA","El documental sigue la vida de una orca en cautiverio y su impacto en la industria del entretenimiento marino.","Documental",19,2013);
        Pelicula peli12 = new Pelicula("The Social Dilemma",94,"PG-13","USA","El documental explora cómo las redes sociales están diseñadas para manipular la conducta humana y su impacto en la sociedad.","Documental",5,2020);

        TiendaDeVideo.agregarPeliculaAVideoStore(peli);
        TiendaDeVideo.agregarPeliculaAVideoStore(peli2);
        TiendaDeVideo.agregarPeliculaAVideoStore(peli3);
        TiendaDeVideo.agregarPeliculaAVideoStore(peli4);
        TiendaDeVideo.agregarPeliculaAVideoStore(peli5);
        TiendaDeVideo.agregarPeliculaAVideoStore(peli6);
        TiendaDeVideo.agregarPeliculaAVideoStore(peli7);
        TiendaDeVideo.agregarPeliculaAVideoStore(peli8);
        TiendaDeVideo.agregarPeliculaAVideoStore(peli9);
        TiendaDeVideo.agregarPeliculaAVideoStore(peli10);
        TiendaDeVideo.agregarPeliculaAVideoStore(peli11);
        TiendaDeVideo.agregarPeliculaAVideoStore(peli12);
    }
    public static void llenarBaseDeDatosClientes (VideoStore TiendaDeVideo)
    {
        Pelicula peli = new Pelicula("John Wick",101,"R","USA","Un exasesino busca venganza contra un grupo de gángsters que mataron a su perro.","Accion",15,2014);
        Pelicula peli2 = new Pelicula ("Mad Max: Fury Road",120,"R","AUS/USA","Un guerrero postapocalíptico ayuda a un grupo de mujeres a escapar de un líder opresor.","Accion",21,2015);

        Pelicula peli3 = new Pelicula("Indiana Jones and the Raiders of the Lost Ark",115,"PG","USA","El arqueólogo Indiana Jones busca el Arca de la Alianza antes de que caiga en manos nazis.","Aventura",26,1981);
        Pelicula peli4 = new Pelicula("The Lord of the Rings: The Fellowship of the Ring",178,"PG","NZ/USA","Un grupo de aventureros emprende una peligrosa misión para destruir un anillo que amenaza con destruir el mundo.","Aventura",7,2001);

        Pelicula peli5 = new Pelicula("The Hangover",100,"R","USA","Un grupo de amigos despiertan después de una noche de desenfreno en Las Vegas sin recordar nada de lo sucedido.","Comedia",12,2009);
        Pelicula peli6 = new Pelicula("Bridesmaids",125, "R", "USA","Una dama de honor intenta hacer frente a la caótica boda de su mejor amiga.","Comedia",26,2011);

        Pelicula peli7 = new Pelicula("The Shawshank Redemption",142,"R","USA","Un banquero es encarcelado por asesinato y lucha por su supervivencia en la prisión de Shawshank.","Drama",11,1994);
        Pelicula peli8 = new Pelicula("The Godfather",175,"R","USA","La historia épica de la familia Corleone y su lucha por el poder en el mundo del crimen organizado","Drama",17,1972);

        Pelicula peli9 = new Pelicula("The Exorcist",122,"R","USA","Una madre lucha por salvar a su hija poseída por una entidad demoníaca.","Horror",18,1973);
        Pelicula peli10= new Pelicula("The Conjuring",112,"R","USA","Una pareja de investigadores paranormales ayuda a una familia a lidiar con una presencia maligna en su casa.","Horror",23,2013);

        Pelicula peli11 = new Pelicula("Blackfish",83,"PG-13","USA","El documental sigue la vida de una orca en cautiverio y su impacto en la industria del entretenimiento marino.","Documental",19,2013);
        Pelicula peli12 = new Pelicula("The Social Dilemma",94,"PG-13","USA","El documental explora cómo las redes sociales están diseñadas para manipular la conducta humana y su impacto en la sociedad.","Documental",5,2020);
        ///Preguntar
        TiendaDeVideo.agregarPeliculaAVideoStore(peli);
        TiendaDeVideo.agregarPeliculaAVideoStore(peli2);
        TiendaDeVideo.agregarPeliculaAVideoStore(peli3);
        TiendaDeVideo.agregarPeliculaAVideoStore(peli4);
        TiendaDeVideo.agregarPeliculaAVideoStore(peli5);
        TiendaDeVideo.agregarPeliculaAVideoStore(peli6);
        TiendaDeVideo.agregarPeliculaAVideoStore(peli7);
        TiendaDeVideo.agregarPeliculaAVideoStore(peli8);
        TiendaDeVideo.agregarPeliculaAVideoStore(peli9);
        TiendaDeVideo.agregarPeliculaAVideoStore(peli10);
        TiendaDeVideo.agregarPeliculaAVideoStore(peli11);
        TiendaDeVideo.agregarPeliculaAVideoStore(peli12);

        Cliente cliente = new Cliente("Tomas","Benito Lynch 45",12345678);
        cliente.agregarPeliculaDeClienteAArrayList(peli11);
        cliente.agregarPeliculaDeClienteAArrayList(peli2);
        cliente.agregarPeliculaDeClienteAArrayList(peli4);

        TiendaDeVideo.agregarClienteAVideoStore(cliente);

        Cliente cliente2 = new Cliente("Ramiro","Genova 3145",87654321);
        cliente2.agregarPeliculaDeClienteAArrayList(peli3);
        cliente2.agregarPeliculaDeClienteAArrayList(peli);

        TiendaDeVideo.agregarClienteAVideoStore(cliente2);

        Cliente cliente3 = new Cliente("Pelado","Constitucion 1450",34567890);
        cliente3.agregarPeliculaDeClienteAArrayList(peli5);
        cliente3.agregarPeliculaDeClienteAArrayList(peli7);
        cliente3.agregarPeliculaDeClienteAArrayList(peli4);
        cliente3.agregarPeliculaDeClienteAArrayList(peli8);

        TiendaDeVideo.agregarClienteAVideoStore(cliente3);

        Cliente cliente4 = new Cliente("Lauti","Lebensohn 4213",10293847);
        cliente4.agregarPeliculaDeClienteAArrayList(peli6);
        cliente4.agregarPeliculaDeClienteAArrayList(peli9);
        cliente4.agregarPeliculaDeClienteAArrayList(peli10);

        TiendaDeVideo.agregarClienteAVideoStore(cliente4);

        Cliente cliente5 = new Cliente("Luquitas","Luis Agote 2892",45539094);
        cliente5.agregarPeliculaDeClienteAArrayList(peli12);
        cliente5.agregarPeliculaDeClienteAArrayList(peli);
        cliente5.agregarPeliculaDeClienteAArrayList(peli8);
        cliente5.agregarPeliculaDeClienteAArrayList(peli2);
        cliente5.agregarPeliculaDeClienteAArrayList(peli3);
        cliente5.agregarPeliculaDeClienteAArrayList(peli4);

        TiendaDeVideo.agregarClienteAVideoStore(cliente5);
    }
    public static void gestionarDevolucion (VideoStore TiendaDeVideo)
    {
        ///Preguntar como solucionar repeticion de codigo
        Pelicula peli = new Pelicula("John Wick",101,"R","USA","Un exasesino busca venganza contra un grupo de gángsters que mataron a su perro.","Accion",15,2014);
        Pelicula peli2 = new Pelicula ("Mad Max: Fury Road",120,"R","AUS/USA","Un guerrero postapocalíptico ayuda a un grupo de mujeres a escapar de un líder opresor.","Accion",21,2015);

        Pelicula peli3 = new Pelicula("Indiana Jones and the Raiders of the Lost Ark",115,"PG","USA","El arqueólogo Indiana Jones busca el Arca de la Alianza antes de que caiga en manos nazis.","Aventura",26,1981);
        Pelicula peli4 = new Pelicula("The Lord of the Rings: The Fellowship of the Ring",178,"PG","NZ/USA","Un grupo de aventureros emprende una peligrosa misión para destruir un anillo que amenaza con destruir el mundo.","Aventura",7,2001);

        Pelicula peli5 = new Pelicula("The Hangover",100,"R","USA","Un grupo de amigos despiertan después de una noche de desenfreno en Las Vegas sin recordar nada de lo sucedido.","Comedia",12,2009);
        Pelicula peli6 = new Pelicula("Bridesmaids",125, "R", "USA","Una dama de honor intenta hacer frente a la caótica boda de su mejor amiga.","Comedia",26,2011);

        Pelicula peli7 = new Pelicula("The Shawshank Redemption",142,"R","USA","Un banquero es encarcelado por asesinato y lucha por su supervivencia en la prisión de Shawshank.","Drama",11,1994);
        Pelicula peli8 = new Pelicula("The Godfather",175,"R","USA","La historia épica de la familia Corleone y su lucha por el poder en el mundo del crimen organizado","Drama",17,1972);

        Pelicula peli9 = new Pelicula("The Exorcist",122,"R","USA","Una madre lucha por salvar a su hija poseída por una entidad demoníaca.","Horror",18,1973);
        Pelicula peli10= new Pelicula("The Conjuring",112,"R","USA","Una pareja de investigadores paranormales ayuda a una familia a lidiar con una presencia maligna en su casa.","Horror",23,2013);

        Pelicula peli11 = new Pelicula("Blackfish",83,"PG-13","USA","El documental sigue la vida de una orca en cautiverio y su impacto en la industria del entretenimiento marino.","Documental",19,2013);
        Pelicula peli12 = new Pelicula("The Social Dilemma",94,"PG-13","USA","El documental explora cómo las redes sociales están diseñadas para manipular la conducta humana y su impacto en la sociedad.","Documental",5,2020);
        ///Preguntar
        TiendaDeVideo.agregarPeliculaAVideoStore(peli);
        TiendaDeVideo.agregarPeliculaAVideoStore(peli2);
        TiendaDeVideo.agregarPeliculaAVideoStore(peli3);
        TiendaDeVideo.agregarPeliculaAVideoStore(peli4);
        TiendaDeVideo.agregarPeliculaAVideoStore(peli5);
        TiendaDeVideo.agregarPeliculaAVideoStore(peli6);
        TiendaDeVideo.agregarPeliculaAVideoStore(peli7);
        TiendaDeVideo.agregarPeliculaAVideoStore(peli8);
        TiendaDeVideo.agregarPeliculaAVideoStore(peli9);
        TiendaDeVideo.agregarPeliculaAVideoStore(peli10);
        TiendaDeVideo.agregarPeliculaAVideoStore(peli11);
        TiendaDeVideo.agregarPeliculaAVideoStore(peli12);

        Cliente cliente = new Cliente("Tomas","Benito Lynch 45",12345678);
        cliente.agregarPeliculaDeClienteAArrayList(peli11);
        cliente.agregarPeliculaDeClienteAArrayList(peli2);
        cliente.agregarPeliculaDeClienteAArrayList(peli4);

        TiendaDeVideo.agregarClienteAVideoStore(cliente);

        Cliente cliente2 = new Cliente("Ramiro","Genova 3145",87654321);
        cliente2.agregarPeliculaDeClienteAArrayList(peli3);
        cliente2.agregarPeliculaDeClienteAArrayList(peli);

        TiendaDeVideo.agregarClienteAVideoStore(cliente2);

        Cliente cliente3 = new Cliente("Pelado","Constitucion 1450",34567890);
        cliente3.agregarPeliculaDeClienteAArrayList(peli5);
        cliente3.agregarPeliculaDeClienteAArrayList(peli7);
        cliente3.agregarPeliculaDeClienteAArrayList(peli4);
        cliente3.agregarPeliculaDeClienteAArrayList(peli8);

        TiendaDeVideo.agregarClienteAVideoStore(cliente3);

        Cliente cliente4 = new Cliente("Lauti","Lebensohn 4213",10293847);
        cliente4.agregarPeliculaDeClienteAArrayList(peli6);
        cliente4.agregarPeliculaDeClienteAArrayList(peli9);
        cliente4.agregarPeliculaDeClienteAArrayList(peli10);

        TiendaDeVideo.agregarClienteAVideoStore(cliente4);

        Cliente cliente5 = new Cliente("Luquitas","Luis Agote 2892",45539094);
        cliente5.agregarPeliculaDeClienteAArrayList(peli12);
        cliente5.agregarPeliculaDeClienteAArrayList(peli);
        cliente5.agregarPeliculaDeClienteAArrayList(peli8);
        cliente5.agregarPeliculaDeClienteAArrayList(peli2);
        cliente5.agregarPeliculaDeClienteAArrayList(peli3);
        cliente5.agregarPeliculaDeClienteAArrayList(peli4);

        TiendaDeVideo.agregarClienteAVideoStore(cliente5);

        Boleta boletita = new Boleta(cliente5);

        Pelicula peliculita = cliente5.getPeliculas().get(3);

        System.out.println("Stock de la pelicula " + peliculita.getTitulo() + "antes de ser devuelta: " + peliculita.getStock());

        boletita.devolverPelicula(peliculita);
        System.out.println("Fecha de retiro: " + boletita.getFechaRetiro());
        System.out.println("Fecha de devolucion: " + boletita.getFechaDevolucion());
        System.out.println("Stock de la pelicula " + peliculita.getTitulo() + "luego de ser devuelta: " + peliculita.getStock());


    }
}