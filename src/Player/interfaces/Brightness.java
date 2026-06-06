package Player.interfaces;

public interface Brightness {

    int getBrightness();

    void setBrightness(int brightness);

    default void increaseBrightness() {
        setBrightness(getBrightness() + 1);
    }

    default void decreaseBrightness() {
        if (getBrightness() > 0) {
            setBrightness(getBrightness() - 1);
        }
    }
}
