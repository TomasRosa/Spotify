import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class ListaPremium implements Reproduccion
{
    private String nombre;
    LinkedList<Cancion> miLista;

    public ListaPremium(String nombre)
    {
        this.nombre = nombre;
        this.miLista = new LinkedList<Cancion>();
    }
    public void pasarDeArrayListToLinkedList (ArrayList<Cancion> playlist)
    {
        for(Cancion cancioncita: playlist)
        {
            this.miLista.add(cancioncita);
        }
    }

    @Override
    public void Reproducir() ///Dudas cambiar cancion y reproducir. Si yo cambio la cancion, al llamar metodo reproducir me tendrian que aparecer las caracteristicas de la nueva cancion? no comprendo eso.
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Playlist: ");

        verPlaylist();

        System.out.println("Ingrese el nombre de la cancion que deseas escuchar. ");
        String nombre = scan.nextLine();

        Cancion cancionARetornar = buscarCancion(nombre);

        if(cancionARetornar == null)
        {
            System.out.println("Esa cancion no se encuentra en la playlist. ");
        }
        else
        {
            System.out.println("Cancion encontrada correctamente.");
            System.out.println("Cancion en reproduccion: " + cancionARetornar.getNombre());
            System.out.println("Nombre del album: " + cancionARetornar.getAlbum().getTitulo());
            System.out.println("Genero de la cancion: " + cancionARetornar.getGenero());
            System.out.println("Nombre del artista que la canta: " + cancionARetornar.getAlbum().getArtista());
            if(cancionARetornar.getArtistaInvitado() != null)
            {
                System.out.println("Artista invitado que participa en la cancion: " + cancionARetornar.getArtistaInvitado());
            }
            else
            {
                System.out.println("No hay artista invitado en esta cancion.");
            }
        }

    }

    @Override
    public void aniadirCancion(Cancion cancion)
    {
        this.miLista.add(cancion);
    }

    @Override
    public void eliminarCancion(String nombreCancion)
    {
        for(Cancion cancioncita: this.miLista)
        {
            if(cancioncita.getNombre().equalsIgnoreCase(nombreCancion))
            {
                this.miLista.remove(cancioncita);
            }
        }
    }

    @Override
    public void verPlaylist()
    {
        for(Cancion cancioncita: this.miLista)
        {
            System.out.println(cancioncita.getNombre());
        }
    }

    @Override
    public void cambiarCancion(String cancionAElegir)
    {
        ///Muestro nombre de la cancion en reproduccion. (La primera)
        System.out.println("Cancion en reproduccion: ");
        this.miLista.get(0).getNombre();
        ///Llevo la primera cancion al final ya que se va a cambiar la cancion.
        ///Paso como parametro finalList + 1 para no sobreescribir la ultima cancion.
        ///Como segundo parametro paso la cancion a pasar al ultimo lugar.
        int finalList = this.miLista.size();
        this.miLista.add(finalList+1,this.miLista.get(0));

        Cancion cancionAEscuchar = buscarCancion(cancionAElegir);

        if(cancionAEscuchar == null)
        {
            System.out.printf("Esa cancion no se encuentra en la playlist.");
        }
        else
        {
            ///Una vez que encontre la cancion la pongo al principio para que se reproduzca.
            this.miLista.add(0,cancionAEscuchar);
            System.out.println("Se ha encontrado. Nueva cancion en reproduccion: " + this.miLista.get(0).getNombre());
        }
    }
    public Cancion buscarCancion (String nombreCancion)
    {
        Cancion cancionARetornar = null;

        for(Cancion cancioncita: this.miLista)
        {
            if(cancioncita.getNombre().equalsIgnoreCase(nombreCancion))
            {
                cancionARetornar = cancioncita;
            }
        }
        return cancionARetornar;
    }
}
