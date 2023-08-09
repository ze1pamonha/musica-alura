package alura.musica.principal;

import alura.musica.MinhasPreferidas;
import alura.musica.Podicast;
import alura.musica.musica;

public class principal {
    public static void main(String[] args) {

        musica minhaMusica=new musica();
    minhaMusica.setTitulo("forever");
    minhaMusica.setCantor("kiss");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }
        for (int i = 0; i < 50; i++) {
      minhaMusica.curte();
        }
        Podicast meuPodicast=new Podicast();

        meuPodicast.setTitulo("bolha dev");
        meuPodicast.setApresentador("marcus mendes");

        for (int i = 0; i < 5000; i++) {
            meuPodicast.reproduz();
        }
        for (int i = 0; i < 1000; i++) {
            meuPodicast.curte();
        }
        MinhasPreferidas preferidas=new MinhasPreferidas();
        preferidas.incui(meuPodicast);
        preferidas.incui(minhaMusica);
    }
}
