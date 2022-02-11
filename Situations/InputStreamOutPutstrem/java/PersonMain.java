public class PersonMain {
    int age;

    private static String name = "Ivan";
    private transient String famName;

    public PersonMain(int age, String famName) {
        this.age = age;
        this.famName = famName;
    }

    public PersonMain() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        PersonMain.name = name;
    }

    public String getFamName() {
        return famName;
    }

    public void setFamName(String famName) {
        this.famName = famName;
    }

}
