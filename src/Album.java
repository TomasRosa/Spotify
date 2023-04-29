import java.time.LocalDate;

public class Album
{
    LocalDate anioAlbum;
    String titulo;
    Artista artista;

    public Album ()
    {

    }
    public Album (String titulo, Artista artista)
    {
        this.anioAlbum = generarAñoRandom();
        this.titulo = titulo;
        this.artista = artista;
    }

    public LocalDate getAnioAlbum() {
        return anioAlbum;
    }

    public void setAnioAlbum(LocalDate anioAlbum) {
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

    public LocalDate generarAñoRandom ()
    {
        int year = (int) Math.floor(Math.random() * (2023 - 1900 + 1) + 1900); // Genera un año aleatorio entre 1900 y 2023.
        int month = (int) Math.floor(Math.random() * 12) + 1; // Genera un mes aleatorio entre 1 y 12.
        int day = (int) Math.floor(Math.random() * (LocalDate.of(year, month, 1).lengthOfMonth() - 1 + 1) + 1); // Genera un día aleatorio válido para el mes y año generados.

        LocalDate fechaAleatoria = LocalDate.of(year, month, day); // Crea una fecha aleatoria con los valores generados.
        return fechaAleatoria;
    }
}

