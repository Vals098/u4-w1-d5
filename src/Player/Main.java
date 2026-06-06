package Player;

import Player.entities.Audio;
import Player.entities.ElementoMultimediale;
import Player.entities.Immagine;
import Player.entities.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ElementoMultimediale[] elementi = new ElementoMultimediale[5];

        elementi[0] = new Video("video1", 4, 6, 1);
        elementi[1] = new Audio("Bohemian Rapsody", 5, 7);
        elementi[2] = new Immagine("img1", 5);
        elementi[3] = new Video("video2", 1, 0, 5);
        elementi[4] = new Immagine("img2", 0);


        Scanner scanner = new Scanner(System.in);

//da input utente a elementi dell'array ElementoMultimediale


//da input numerico a esegui()
        int scelta;

        do {
            System.out.println("Scegli un elemento da eseguire inserendo un numero da 1 a 5:");
            System.out.println("Per fermare inseririe 0");

            scelta = Integer.parseInt(scanner.nextLine());

            if (scelta >= 1 && scelta <= 5) {
                elementi[scelta - 1].esegui();
            } else if (scelta < 0) {
                System.out.println("Errore: numero troppo piccolo");
            } else if (scelta > 5) {
                System.out.println("Errore: numero troppo grande");
            }

        } while (scelta != 0);


    }
}
