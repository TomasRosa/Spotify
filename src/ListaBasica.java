import java.util.ArrayList;
import java.util.Stack;

public class ListaBasica implements Reproduccion
{
    private String nombre;
    Stack<Cancion> miLista;

    public ListaBasica ()
    {
        this.miLista = new Stack<Cancion>();
    }
    public ListaBasica(String nombre)
    {
        this.nombre = nombre;
        this.miLista = new Stack<Cancion>();
    }
    public void pasarCancionesDeArrayListToStack (ArrayList<Cancion> playlist)
    {
        for(int i = 0; i < playlist.size(); i++)
        {
            this.miLista.push(playlist.get(i)); ///Agrega el elemento del arrayList a la pila con el metodo push al final de la pila.
        }
    }
    @Override
    public void Reproducir()
    {
        ///Cancion de la primera posicion = cancion reproduciendose.

        System.out.println("Cancion en reproduccion: " + this.miLista.get(0).getNombre());
        System.out.println("Nombre del album: " + this.miLista.get(0).getAlbum().getTitulo());
        System.out.println("Genero de la cancion: " + this.miLista.get(0).getGenero());
        System.out.println("Nombre del artista que la canta: " + this.miLista.get(0).getAlbum().getArtista().getNombre());
        if(this.miLista.get(0).getArtistaInvitado() != null)
        {
            System.out.println("Artista invitado que participa en la cancion: " + this.miLista.get(0).getArtistaInvitado().getNombre());
        }
        else
        {
            System.out.println("No hay artista invitado en esta cancion.");
        }
    }

    @Override
    public void aniadirCancion(Cancion cancion)
    {
        this.miLista.push(cancion);
    }

    @Override
    public void eliminarCancion(String nombreCancion)
    {
        System.out.println("Para acceder a esta opcion pague el pack premium. ");
    }

    @Override
    public void verPlaylist()
    {
        for(Cancion pilita: this.miLista)
        {
            System.out.println(pilita.getNombre() + " de " + pilita.getAlbum().getArtista().getNombre());
            if(pilita.getArtistaInvitado() != null)
            {
                System.out.println("y de " + pilita.getArtistaInvitado().getNombre());
            }
        }
    }

    @Override
    public void cambiarCancion(String cancionAElegir)
    {
        System.out.println("Para acceder a esta opcion pague el pack premium. ");
    }
}

