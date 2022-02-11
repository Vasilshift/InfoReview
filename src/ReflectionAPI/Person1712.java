package ReflectionAPI;


public class Person1712 {
    private int id;
    private String name;
    public String surname;

    public Person1712(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person1712(){}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
