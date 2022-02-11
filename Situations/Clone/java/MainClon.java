public class MainClon {
    public static void main(String[] args) throws CloneNotSupportedException {
        PersonN personN = new PersonN();

        PersonN p1 = (PersonN) personN.clone();

        System.out.println(p1.name == personN.name);   //true
        System.out.println(p1.age == personN.age);   // true
        System.out.println(p1 == personN);          //false
        System.out.println(p1.equals(personN));     //true

        System.out.println("personN: " + personN);
        System.out.println("p1: " + p1);

        PersonC personC = new PersonC(14, "Ilya");

        PersonC personC1 = new PersonC(personC);     //копирование объекта с помощью конструктора копирования

        PersonC personC2 = (PersonC) personC.clone();
        System.out.println("personC - new object of class: " + personC.hashCode());

        System.out.println("clone of personC: " + personC1.hashCode());



    }
}
