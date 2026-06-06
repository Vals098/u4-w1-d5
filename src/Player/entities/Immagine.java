package Player.entities;

import Player.interfaces.Brightness;
import Player.interfaces.Showable;

public class Immagine extends ElementoMultimediale implements Showable, Brightness {

    //    attributi
    private int brightness;

    //    costruttori
    public Immagine(String title, int brightness) {
        super(title);
        setBrightness(brightness);
    }

//    getter e setter

    //metodi
    @Override
    public String toString() {
        return "Immagine{" +
                "title='" + title + '\'' +
                ", brightness=" + brightness +
                '}';
    }

    @Override
    public void esegui() {
        show();
    }

    @Override
    public void show() {

        String asterischi = "";
        for (int i = 0; i < brightness; i++) {
            asterischi += "*";
        }

        System.out.println(title + asterischi);
    }


    @Override
    public int getBrightness() {
        return brightness;
    }

    @Override
    public void setBrightness(int brightness) {
        if (brightness >= 0) {
            this.brightness = brightness;
        } else System.out.println("La luminosità deve essere >= 0");
    }
}
