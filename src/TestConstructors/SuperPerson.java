package TestConstructors;

public interface SuperPerson {
    void methodX();
    default void methodDef() {
        System.out.println("hjvhj");
    }
}
