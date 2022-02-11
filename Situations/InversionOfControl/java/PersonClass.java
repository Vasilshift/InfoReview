class PersonClass implements PersonInterface{

    int age;
    String name;

    public PersonClass(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("PersonClass is ruunning");
    }

    public void walk() {
        System.out.println("personClass wolk");
    }

}
