import java.util.Objects;

public class Cancion
{
    private String nombre; ///Nombre cancion
    private double duracionCancion; ///Duracion de la cancion
    private Album album; ///Album al que pertenece la cancion.
    private Artista artista; ///Artista que canta la cancion.

    public Cancion ()
    {

    }
    public Cancion(String nombre, double duracionCancion, Album album, Artista artista)
    {
        this.nombre = nombre;
        this.duracionCancion = duracionCancion;
        this.album = album;
        this.artista = artista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDuracionCancion() {
        return duracionCancion;
    }

    public void setDuracionCancion(double duracionCancion) {
        this.duracionCancion = duracionCancion;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "nombre='" + nombre + '\'' +
                ", duracionCancion=" + duracionCancion +
                ", album=" + album +
                ", artista=" + artista +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cancion cancion = (Cancion) o;
        return Double.compare(cancion.duracionCancion, duracionCancion) == 0 && Objects.equals(nombre, cancion.nombre) && Objects.equals(album, cancion.album) && Objects.equals(artista, cancion.artista);
    }

}
