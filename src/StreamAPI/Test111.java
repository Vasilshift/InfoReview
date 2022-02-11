package StreamAPI;

import java.util.ArrayList;
import java.util.List;

// don't realize correct
public class Test111 {
    public static void main(String[] args) {
        //ArrayList<Car> newCars = Test.getOurCars(new Car(1, "masha")


    }
}

class Test {

    public static List<Car> getOurCars(List<Car> ourCars) {
        ourCars = new ArrayList<>();
        return ourCars;
    }
}


class Car {
    int engine;
    String name;

    public Car(int engine, String name) {
        this.engine = engine;
        this.name = name;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
