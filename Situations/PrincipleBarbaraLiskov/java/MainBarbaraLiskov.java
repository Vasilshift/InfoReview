public class MainBarbaraLiskov {
    public static void main(String[] args) {

        PersonP personP = new PersonP(18);
        PersonP childP = new ChildP(10, "Yasha");

        childP.run(childP);

        personP.run(personP);




    }
}
