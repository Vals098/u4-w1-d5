package Player.entities;

import Player.interfaces.Playable;

public class RegistrazioneAudio extends ElementoMultimediale implements Playable {
    public RegistrazioneAudio(String titolo) {
        super(titolo);
    }

    @Override
    public String toString() {
        return "RegistrazioneAudio{}";
    }

    @Override
    public void esegui() {
        play();
    }

    @Override
    public void play() {
        System.out.println("Riproduzione audio: " + titolo);
    }

}
