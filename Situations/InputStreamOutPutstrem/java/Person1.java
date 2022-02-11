import java.io.*;

public class Person1 extends PersonMain implements Serializable {
    private int brain;
    private int foo;

    private static final long serialVersionUID = 1L;

    public int getFoo() {
        return foo;
    }

    public void setFoo(int foo) {
        this.foo = foo;
    }

    public Person1(int age, String famName, int brain) {
        super(age, famName);
        this.brain = brain;
    }

    public Person1() { }

    public int getBrain() {
        return brain;
    }

    public void setBrain(int brain) {
        this.brain = brain;
    }


}
