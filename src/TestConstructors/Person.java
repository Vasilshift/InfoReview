package TestConstructors;

public abstract class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    public Person() {

    }

    public abstract void method();
}
