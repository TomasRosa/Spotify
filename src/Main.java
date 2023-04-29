import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ///1.
        Scanner scan = new Scanner(System.in);
        ArrayList<Cancion> playList = new ArrayList<Cancion>();

        gestionarPlayList(playList);

        System.out.println("Ingrese 1 si usted es usuario premium. ");
        System.out.println("Ingrese 2 si usted es usuario pobre. ");
        int opcion = scan.nextInt();

        switch (opcion)
        {
            case 1:
            {
                ListaPremium spotifyPremium = new ListaPremium("Playlist Trap.");
                spotifyPremium.pasarDeArrayListToLinkedList(playList);

                System.out.println("Ingrese que funcionalidades de la lista premium desea probar. ");
                System.out.println("(1). Reproducir cancion. ");
                System.out.println("(2). Aniadir cancion. ");
                System.out.println("(3). Eliminar cancion. ");
                System.out.println("(4). Ver playlist. ");
                System.out.println("(5). Cambiar cancion. ");
                int opcionPremium = scan.nextInt();

                switch (opcionPremium)
                {
                    case 1:
                    {
                        spotifyPremium.Reproducir();
                        break;
                    }
                    case 2:
                    {
                        System.out.println("PlayList antes de aniadir la cancion: ");
                        spotifyPremium.verPlaylist();

                        System.out.println("Vas a aniadir una cancion. Completa los siguientes campos.");
                        System.out.println("---DATOS DEL ARTISTA DE LA CANCION---");
                        System.out.println("Ingrese nombre del artista. ");
                        String nombre = scan.nextLine();
                        System.out.println("Ingrese edad del artista. ");
                        int edad = scan.nextInt();
                        System.out.println("Ingrese la nacionalidad del artista. ");
                        String nacionalidad = scan.nextLine();

                        Artista artista = new Artista(nombre,edad,nacionalidad);

                        System.out.println("---DATOS DEL ALBUM DE LA CANCION---");
                        System.out.println("Ingrese el anio en el que salio el album. ");
                        int anioAlbum = scan.nextInt();
                        System.out.println("Ingrese el titulo del album. ");
                        String titulo = scan.nextLine();

                        Album album = new Album(titulo,artista,anioAlbum);

                        System.out.println("---DATOS DE LA CANCION---");
                        System.out.println("Ingrese el nombre de la cancion. ");
                        String nombreCancion = scan.nextLine();
                        System.out.println("Ingrese la duracion de la cancion. ");
                        double duracionCancion = scan.nextDouble();
                        System.out.println("Ingrese el genero de la cancion. ");
                        String genero = scan.nextLine();

                        System.out.println("La cancion que estas ingresando posee un artista invitado? s/n. ");
                        char control = scan.next().charAt(0);

                        if(control == 's')
                        {
                            System.out.println("Ingrese datos del artista invitado. ");
                            System.out.println("Ingrese nombre del artista. ");
                            String nombre2 = scan.nextLine();
                            System.out.println("Ingrese edad del artista. ");
                            int edad2 = scan.nextInt();
                            System.out.println("Ingrese la nacionalidad del artista. ");
                            String nacionalidad2 = scan.nextLine();

                            Artista artista2 = new Artista(nombre2,edad2,nacionalidad2);

                            Cancion cancionCArtistaInvitado = new Cancion(nombre,duracionCancion,album,artista2,genero);
                            spotifyPremium.aniadirCancion(cancionCArtistaInvitado);

                            System.out.println("Playlist luego de agregar la nueva cancion: ");
                            spotifyPremium.verPlaylist();
                        }
                        else
                        {
                            Cancion cancionSArtistaInvitado = new Cancion(nombre,duracionCancion,album,genero);
                            spotifyPremium.aniadirCancion(cancionSArtistaInvitado);

                            System.out.println("Playlist luego de agregar la nueva cancion: ");
                            spotifyPremium.verPlaylist();
                        }
                        break;
                    }
                    case 3:
                    {
                        System.out.println("Playlist antes de eliminar la cancion: ");
                        spotifyPremium.verPlaylist();

                        System.out.println("Ingrese el nombre de la cancion que desea eliminar. ");
                        String nombre = scan.nextLine();

                        spotifyPremium.eliminarCancion(nombre);

                        System.out.println("Playlist luego de eliminar la cancion: ");
                        spotifyPremium.verPlaylist();
                        break;
                    }
                    case 4:
                    {
                        spotifyPremium.verPlaylist();
                        break;
                    }
                    case 5:
                    {
                        System.out.println("Ingrese el nombre de la cancion que deseas poner. ");
                        String nombre = scan.nextLine();

                        spotifyPremium.cambiarCancion(nombre);
                        break;
                    }
                }
            }
            case 2:
            {

            }
        }


    }
    public static void gestionarPlayList (ArrayList<Cancion> canciones)
    {
        Artista artista1 = new Artista("Duki", 25, "Argentina");
        Artista artista2 = new Artista("Quevedo", 30, "España");
        Artista artista3 = new Artista("Big Soto", 28, "Colombia");
        Artista artista4 = new Artista("Santa Fe Klan", 22, "México");

        Album album1 = new Album("NO VENDO TRAP", artista1, 2010);
        Album album2 = new Album("QUEDATE", artista2, 2015);
        Album album3 = new Album("DELINCUENTE", artista3, 2018);
        Album album4 = new Album("MI MEXICO", artista4, 2020);

        Cancion cancion1 = new Cancion("GIVENCHY", 2.39, album1, artista2,"Trap");
        Cancion cancion2 = new Cancion("A HUEVO CARNAL", 4.20, album4, artista3,"Trap");

        Cancion cancion3 = new Cancion("COLOMBIA", 2.20, album3,"Trap");
        Cancion cancion4 = new Cancion("QUEDATE REMIX", 3.29, album2,"Trap");

        canciones.add(cancion1);
        canciones.add(cancion2);
        canciones.add(cancion3);
        canciones.add(cancion4);
    }
}