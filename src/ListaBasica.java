import java.util.ArrayList;
import java.util.Stack;

public class ListaBasica implements Reproduccion
{
    private String nombre;
    Stack<Cancion> miLista;

    public ListaBasica ()
    {

    }
    public ListaBasica(String nombre, Stack<Cancion> miLista)
    {
        this.nombre = nombre;
        this.miLista = miLista;
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
        Cancion cancionEnReproduccion = this.miLista.peek();

        System.out.println("Cancion en reproduccion: " + cancionEnReproduccion.getNombre());
        System.out.println("Nombre del album: " + cancionEnReproduccion.getAlbum().getTitulo());
        System.out.println("Genero de la cancion: " + cancionEnReproduccion.getGenero());
        System.out.println("Nombre del artista que la canta: " + cancionEnReproduccion.getAlbum().getArtista());
        if(cancionEnReproduccion.getArtistaInvitado() != null)
        {
            System.out.println("Artista invitado que participa en la cancion: " + cancionEnReproduccion.getArtistaInvitado());
        }
        else
        {
            System.out.println("No hay artista invitado en esta cancion.");
        }
        ///Una vez reproducida mando la cancion del tope (reproducida) al final.
        this.miLista.push(cancionEnReproduccion);
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
            System.out.println(pilita.getNombre());
        }
    }

    @Override
    public void cambiarCancion(String cancionAElegir)
    {
        System.out.println("Para acceder a esta opcion pague el pack premium. ");
    }
}

