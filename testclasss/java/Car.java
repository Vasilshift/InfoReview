import java.util.Objects;

public class Car implements Cloneable {
    int age;
    String model;

    public Car(int age, String model) {
        this.age = age;
        this.model = model;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return age == car.age && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, model);
    }
}
