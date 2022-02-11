import java.util.Objects;

public class PersonN implements Cloneable {
    int age = 15;
    String name = "Vasia";

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonN personN = (PersonN) o;
        return age == personN.age && Objects.equals(name, personN.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return age + name ;
    }
}
