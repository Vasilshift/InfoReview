public class MainClass {
    public static void main(String[] args) {
        Car car = new Car(10, "mercedes");

        //Car car1 = new Car(car);

        Car car2 = new Car(10, "mercedes");


        //Car car2 = (Car) car.clone();

        System.out.println(car.hashCode());
        //System.out.println(car1.hashCode());

        //System.out.println(car == car1);

        System.out.println(car2.equals(car));


        //System.out.println("car2 clone " + car2);





    }
}
