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
    public void Reproducir() ///Dudas sobre si esto esta bien. Siento que para que tenga una funcionalidad habria que llevar la cancion elegida al inicio de la playlist o algo de eso.
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la cancion que deseas escuchar. ");
        String nombre = scan.nextLine();

        Cancion cancionARetornar = buscarCancion(nombre);

        if(cancionARetornar == null)
        {
            System.out.println("Esa cancion no se encuentra en la playlist. ");
        }
        else
        {
            ///Si la cancion se encontro se manda la cancion del inicio al final.
            ///Guardo la primera cancion en cancion inicio para no perderla.
            Cancion cancionInicio = this.miLista.get(0);
            ///Agrego la cancion encontrada al inicio.
            this.miLista.add(0,cancionARetornar);
            int finalLista = this.miLista.size();
            ///Agrego la cancion del inicio al final.
            ///finalLista+1 para no sobreescribir ultima cancion.
            this.miLista.add(finalLista,cancionInicio);

            System.out.println("Cancion encontrada correctamente.");
            System.out.println("Cancion en reproduccion: " + this.miLista.get(0).getNombre());
            System.out.println("Nombre del album: " + this.miLista.get(0).getAlbum().getTitulo());
            System.out.println("Genero de la cancion: " + this.miLista.get(0).getGenero());
            System.out.println("Nombre del artista que la canta: " + this.miLista.get(0).getAlbum().getArtista().getNombre());
            if(cancionARetornar.getArtistaInvitado() != null)
            {
                System.out.println("Artista invitado que participa en la cancion: " + this.miLista.get(0).getArtistaInvitado().getNombre());
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
        for(int i = 0; i < this.miLista.size(); i++)
        {
            if(this.miLista.get(i).getNombre().equalsIgnoreCase(nombreCancion))
            {
                this.miLista.remove(i);
            }
        }
    }

    @Override
    public void verPlaylist()
    {
        for(Cancion cancioncita: this.miLista)
        {
            System.out.println(cancioncita.getNombre() + " de " + cancioncita.getAlbum().getArtista().getNombre());
            if(cancioncita.getArtistaInvitado() != null)
            {
                System.out.println("y de " + cancioncita.getArtistaInvitado().getNombre());
            }
        }
    }

    @Override
    public void cambiarCancion(String cancionAElegir)
    {
        ///Muestro nombre de la cancion en reproduccion. (La primera)
        System.out.println("Cancion en reproduccion: " + this.miLista.get(0).getNombre());
        ///Llevo la primera cancion al final ya que se va a cambiar la cancion.
        ///Como segundo parametro paso la cancion a pasar al ultimo lugar.
        int finalList = this.miLista.size();
        this.miLista.add(finalList,this.miLista.get(0));

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
