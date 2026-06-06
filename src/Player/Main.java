package Player;

import Player.entities.ElementoMultimediale;
import Player.entities.Immagine;
import Player.entities.RegistrazioneAudio;
import Player.entities.Video;

public class Main {
    public static void main(String[] args) {
        ElementoMultimediale[] elementi = new ElementoMultimediale[5];

        elementi[0] = new Video("video1");
        elementi[1] = new RegistrazioneAudio("audio1");
        elementi[2] = new Immagine("img1");
        elementi[3] = new Video("video2");
        elementi[4] = new Immagine("img2");

//        for (ElementoMultimediale elemento : elementi) {
//            System.out.println(elemento.getTitolo());
//        }

        elementi[0].esegui();
        elementi[1].esegui();
        elementi[2].esegui();
        elementi[3].esegui();
        elementi[4].esegui();
    }
}
