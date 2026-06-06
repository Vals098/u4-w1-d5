package Player.entities;

import Player.interfaces.Playable;

public class Video extends ElementoMultimediale implements Playable {
    public Video(String titolo) {
        super(titolo);
    }

    @Override
    public String toString() {
        return "Video{}";
    }

    @Override
    public void esegui() {
        play();
    }

    @Override
    public void play() {
        System.out.println("Riproduzione video: " + titolo);
    }
}
