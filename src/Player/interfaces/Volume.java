package Player.interfaces;

public interface Volume {

    int getVolume();

    void setVolume(int volume);

    default void increaseVolume() {
        setVolume(getVolume() + 1);
    }

    default void decreaseVolume() {
        if (getVolume() > 0) {
            setVolume(getVolume() - 1);
        }
    }
}
