import java.util.Objects;

public class Cancion
{
    private String nombre; ///Nombre cancion
    private double duracionCancion; ///Duracion de la cancion
    private Album album; ///Album al que pertenece la cancion.
    private Artista artistaInvitado; ///Artista invitado si es que hay.
    private String genero;

    public Cancion ()
    {

    }
    ///Constructor a utilizar si hay un artista invitado en el tema.
    public Cancion(String nombre, double duracionCancion, Album album, Artista artista,String genero)
    {
        this.nombre = nombre;
        this.duracionCancion = duracionCancion;
        this.album = album;
        this.artistaInvitado = artista;
        this.genero = genero;
    }
    ///Constructor a utilizar si no hay un artista invitado en el tema.
    public Cancion(String nombre, double duracionCancion, Album album, String genero)
    {
        this.nombre = nombre;
        this.duracionCancion = duracionCancion;
        this.album = album;
        this.genero = genero;
    }

    public Artista getArtistaInvitado() {
        return artistaInvitado;
    }

    public void setArtistaInvitado(Artista artistaInvitado) {
        this.artistaInvitado = artistaInvitado;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
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

    @Override
    public String toString()
    {
        return "Cancion{" +
                "nombre='" + nombre + '\'' +
                ", duracionCancion=" + duracionCancion +
                ", album=" + album +
                ", artistaInvitado=" + artistaInvitado +
                ", genero='" + genero + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cancion cancion = (Cancion) o;
        return Double.compare(cancion.duracionCancion, duracionCancion) == 0 && Objects.equals(nombre, cancion.nombre) && Objects.equals(album, cancion.album) && Objects.equals(artistaInvitado, cancion.artistaInvitado) && Objects.equals(genero, cancion.genero);
    }

}
