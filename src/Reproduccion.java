public interface Reproduccion
{
    void Reproducir (); ///Muestra cancion en reproduccion, nombre de album, genero y nombre de artista.
    void aniadirCancion (Cancion cancion); ///añade cancion recibida por parametro a la playlist.

    void eliminarCancion(String nombreCancion); ///Muestra canciones de la playlist y permite elegir una a eliminar.
    void verPlaylist (); ///Muestra playlist.
    void cambiarCancion (String cancionAElegir); ///Cambia la cancion y pone la que elija el usuario.
}
