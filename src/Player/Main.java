package Player;

import Player.entities.Audio;
import Player.entities.ElementoMultimediale;
import Player.entities.Immagine;
import Player.entities.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ElementoMultimediale[] elementi = new ElementoMultimediale[5];
//prima prova statica
//        elementi[0] = new Video("video1", 4, 6, 1);
//        elementi[1] = new Audio("Bohemian Rapsody", 5, 7);
//        elementi[2] = new Immagine("img1", 5);
//        elementi[3] = new Video("video2", 1, 0, 5);
//        elementi[4] = new Immagine("img2", 0);


        Scanner scanner = new Scanner(System.in);

//da input utente a elementi dell'array ElementoMultimediale
        for (int i = 0; i < elementi.length; i++) {

            System.out.println("Elemento " + (i + 1));

            System.out.println("Scegli un tipo:");
            System.out.println("1 - audio");
            System.out.println("2 - video");
            System.out.println("3 - immagine");

            int tipo = Integer.parseInt(scanner.nextLine());

//      3  casi
            switch (tipo) {
                case 1: {//audio
                    System.out.println("Scegli un titolo:");
                    String title = scanner.nextLine();

                    System.out.println("Scegli una durata (es 1,2,3,...):");
                    int duration = Integer.parseInt(scanner.nextLine());

                    System.out.println("Imposta il volume (es 1,2,3,...):");
                    int volume = Integer.parseInt(scanner.nextLine());

                    elementi[i] = new Audio(title, duration, volume);
                    break;
                }

                case 2: { //video
                    System.out.println("Scegli un titolo:");
                    String title = scanner.nextLine();

                    System.out.println("Scegli una durata (es 1,2,3,...):");
                    int duration = Integer.parseInt(scanner.nextLine());

                    System.out.println("Imposta il volume (es 1,2,3,...):");
                    int volume = Integer.parseInt(scanner.nextLine());

                    System.out.println("Imposta la luminosità (es 1,2,3,...):");
                    int brightness = Integer.parseInt(scanner.nextLine());

                    elementi[i] = new Video(title, volume, duration, brightness);
                    break;
                }

                case 3: {//immagine
                    System.out.println("Scegli un titolo:");
                    String title = scanner.nextLine();

                    System.out.println("Imposta la luminosità (es 1,2,3,...):");
                    int brightness = Integer.parseInt(scanner.nextLine());

                    elementi[i] = new Immagine(title, brightness);
                    break;
                }
                default:
                    System.out.println("Tipo non valido");
                    i--;
            }
        }

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
