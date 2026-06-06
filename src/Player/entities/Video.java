package Player.entities;

import Player.interfaces.Brightness;
import Player.interfaces.Playable;
import Player.interfaces.Volume;

public class Video extends ElementoMultimediale implements Playable, Volume, Brightness {

    //    attributi
    protected int duration;
    protected int volume;
    protected int brightness;


    //costruttori
    public Video(String title, int volume, int duration, int brightness) {
        super(title);
        setVolume(volume);
        setDuration(duration);
        setBrightness(brightness);
    }

    //    getter e setter
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        if (duration >= 0) {
            this.duration = duration;
        } else {
            System.out.println("La duration deve essere >= 0");
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
        return "Video{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                ", volume=" + volume +
                ", brightness=" + brightness +
                '}';
    }

    @Override
    public void esegui() {
        play();
    }

    @Override
    public void play() {
        for (int i = 0; i < duration; i++) {

            String puntiEsclamativi = "";
            for (int j = 0; j < volume; j++) {
                puntiEsclamativi += "!";
            }

            String asterischi = "";
            for (int j = 0; j < brightness; j++) {
                asterischi += "*";
            }

            System.out.println(title + puntiEsclamativi + asterischi);
        }
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
