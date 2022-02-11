import java.io.Serializable;
import java.util.Objects;

public class PersonC implements Cloneable, Serializable {
    int age;
    String name;

    public PersonC(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public PersonC(PersonC personC) {
        this(personC.getAge(), personC.getName());
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonC personC = (PersonC) o;
        return age == personC.age && Objects.equals(name, personC.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}
