public class Main
{
    public static void main(String[] args)
    {
        pasarPeliculasToArrayListPeliculasYClientesToArrayListClientes();

    }
    public static void pasarPeliculasToArrayListPeliculasYClientesToArrayListClientes ()
    {
        VideoStore TiendaDeVideo = new VideoStore();

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

        TiendaDeVideo.mostrarPeliculasVideoStore();

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

        Cliente cliente5 = new Cliente("luquitas","Luis Agote 2892",45539094);
        cliente5.agregarPeliculaDeClienteAArrayList(peli12);
        cliente5.agregarPeliculaDeClienteAArrayList(peli);
        cliente5.agregarPeliculaDeClienteAArrayList(peli8);
        cliente5.agregarPeliculaDeClienteAArrayList(peli2);
        cliente5.agregarPeliculaDeClienteAArrayList(peli3);
        cliente5.agregarPeliculaDeClienteAArrayList(peli4);

        TiendaDeVideo.agregarClienteAVideoStore(cliente5);

    }
}