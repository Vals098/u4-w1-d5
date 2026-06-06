package Player.entities;

import Player.interfaces.Luminosità;
import Player.interfaces.Showable;

public class Immagine extends ElementoMultimediale implements Showable, Luminosità {

    //    attributi
    protected int[] asterischi;

    //    costruttori
    public Immagine(String titolo) {
        super(titolo);
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
        System.out.println(titolo);
    }

    @Override
    public void aumentaLuminosità() {

    }

    @Override
    public void diminuisciLuminosità() {

    }
}
