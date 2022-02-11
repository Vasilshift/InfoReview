package PATTERNS.abstract_method;
// ВОЗМОЖНО не реализован корректно
//смысл в создании дополнительной прослойки класса для разделения обязанностей классов наследников
public class AbstractMethod {
    public static void main(String[] args) throws CloneNotSupportedException {
        //AbstractMethod main = new AbstractMethod();
        //main.clone();
        Transport transport = new Ferrari();
        transport.go();

    }
}

interface Transport {
    public void go();
}

abstract class Car implements Transport {
    @Override
    public void go() {
        System.out.println("Car going ... ");
    }
}

class Ferrari extends Car {
    @Override
    public void go() {
        super.go();
    }
}