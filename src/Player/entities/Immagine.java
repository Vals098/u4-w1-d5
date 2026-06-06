package Player.entities;

import Player.interfaces.Brightness;
import Player.interfaces.Showable;

public class Immagine extends ElementoMultimediale implements Showable, Brightness {

    //    attributi


    //    costruttori
    public Immagine(String title) {
        super(title);
    }

//    getter e setter

    //metodi
    @Override
    public String toString() {
        return "Immagine{}";
    }

    @Override
    public void esegui() {
        show();
    }

    @Override
    public void show() {
        System.out.println(title);
    }


    @Override
    public int getBrightness() {
        return 0;
    }

    @Override
    public void setBrightness(int brightness) {

    }
}
