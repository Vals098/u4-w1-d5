package Player.entities;

import Player.interfaces.Playable;
import Player.interfaces.Volume;


public class Audio extends ElementoMultimediale implements Playable, Volume {
    //attributi
    protected int duration;
    protected int volume;

    //costruttori
    public Audio(String title, int duration, int volume) {
        super(title);
        setDuration(duration);
        setVolume(volume);
    }


    //    getter e setter
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        if (duration >= 0) {
            this.duration = duration;
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
        return "Audio{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                ", volume=" + volume +
                '}';
    }

    @Override
    public void esegui() {
        play();
    }

    @Override
    public void play() {
        // ripete un numero di volte = alla duration la stampa del title concatenato a
        // una sequenza di punti esclamativi di lunghezza pari al volume
        for (int i = 0; i < duration; i++) {

            String puntiEsclamativi = "";
            for (int j = 0; j < volume; j++) {
                puntiEsclamativi += "!";
            }

            System.out.println(title + puntiEsclamativi);
        }
    }
}
