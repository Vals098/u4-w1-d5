package Player.entities;

import Player.interfaces.Playable;
import Player.interfaces.Volume;

public class RegistrazioneAudio extends ElementoMultimediale implements Playable, Volume {
    //attributi
    protected int durata;
    protected int volume;

    //costruttori
    public RegistrazioneAudio(String titolo, int durata, int volume) {
        super(titolo);
        setDurata(durata);
        setVolume(volume);
    }


    //    getter e setter
    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        if (durata >= 0) {
            this.durata = durata;
        } else {
            System.out.println("La durata deve essere >= 0");
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= 0) {
            this.volume = volume;
        } else System.out.println("Il volume deve essere >= 0");
    }

    //    metodi
    @Override
    public String toString() {
        return "RegistrazioneAudio{}";
    }

    @Override
    public void esegui() {
        play();
    }


    @Override
    public void alzaVolume() {

    }

    @Override
    public void abbassaVolume() {

    }
}
