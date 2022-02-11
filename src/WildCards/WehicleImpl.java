package WildCards;

public class WehicleImpl implements Wehicle {
    private int wheel;
    private String light;

    public WehicleImpl(int wheel, String light) {
        this.wheel = wheel;
        this.light = light;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public String getLight() {
        return light;
    }

    public void setLight(String light) {
        this.light = light;
    }

    @Override
    public void go() {
        System.out.println("Wehicle goes ... ");
    }
}
