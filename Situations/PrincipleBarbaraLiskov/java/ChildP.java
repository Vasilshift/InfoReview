public class ChildP extends PersonP {

    String name;

    public ChildP(int age, String name) {
        super(age);
        this.name = name;
    }

    @Override
    public void run(PersonP childP) {
        System.out.println("Running child ...");;
    }

    //    public void run() {
//        System.out.println("Running child ...");
//    }
}
