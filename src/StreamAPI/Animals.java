package StreamAPI;

public class Animals {
    private int age;
    private String name;
    private TypeAnimal typeAnimal;

    public Animals(int age, String name, TypeAnimal typeAnimal) {
        this.age = age;
        this.name = name;
        this.typeAnimal = typeAnimal;
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

    public TypeAnimal getTypeAnimal() {
        return typeAnimal;
    }

    public void setTypeAnimal(TypeAnimal typeAnimal) {
        this.typeAnimal = typeAnimal;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
