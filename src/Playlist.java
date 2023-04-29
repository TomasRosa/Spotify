import java.util.ArrayList;

public class Playlist
{
    ArrayList<Cancion> canciones;

    public Playlist()
    {
        this.canciones = new ArrayList<Cancion>();
    }
    public void agregarCancion (Cancion cancion)
    {
        int flag = 0;

        for(Cancion cancioncitas: this.canciones)
        {
            if(cancioncitas.equals(cancion))
            {
                System.out.println("No va a agregarse la cancion ya que ya esta en la playlist.");
                flag = 1;
            }
        }
        if(flag == 0)
        {
            this.canciones.add(cancion);
        }
    }
}
