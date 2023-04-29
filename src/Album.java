
public class Album
{
    int anioAlbum; ///Anio que salio el album.
    String titulo; ///Titulo del album.
    Artista artista; ///Artista que canta el album.

    public Album ()
    {

    }
    public Album (String titulo, Artista artista, int anio)
    {
        this.anioAlbum = anio;
        this.titulo = titulo;
        this.artista = artista;
    }

    public int getAnioAlbum() {
        return anioAlbum;
    }

    public void setAnioAlbum(int anioAlbum) {
        this.anioAlbum = anioAlbum;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "Album{" +
                "anioAlbum=" + anioAlbum +
                ", titulo='" + titulo + '\'' +
                ", artista=" + artista +
                '}';
    }

}

