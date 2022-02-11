package WildCards;

public class Car extends WehicleImpl {

    String disk;

    public Car(int wheel, String light, String disk) {
        super(wheel, light);
        this.disk = disk;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }
}
