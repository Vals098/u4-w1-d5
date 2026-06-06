package Player.entities;

import Player.interfaces.Showable;

public class Immagine extends ElementoMultimediale implements Showable {
    public Immagine(String titolo) {
        super(titolo);
    }

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
        System.out.println("Mostra immagine: " + titolo);
    }
}
