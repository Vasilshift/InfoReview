package PATTERNS.strategy;
// паттерн нужен для избежания большого кол-во IF в программе
//если нужно иметь несколько вариантов поведения в классе

public class StrategyLearn {
    public static void main(String[] args) {
        double priceStart = 100;
        ContextStrategy contextStrategy = new ContextStrategy(new HalfPrice());
        double price = contextStrategy.getPrice(priceStart);
        System.out.println(price);

    }
}

interface UniversalStrategyPrice {
    double getPrice(double price);
}

class FullPrice implements UniversalStrategyPrice {
    @Override
    public double getPrice(double price) {
        return price;
    }
}

class HalfPrice implements UniversalStrategyPrice {
    @Override
    public double getPrice(double price) {
        return price * 0.5;
    }
}

class ContextStrategy {
    UniversalStrategyPrice universalPrice;

    public ContextStrategy(UniversalStrategyPrice universalPrice) {
        this.universalPrice = universalPrice;
    }

    double getPrice(double price) {
        return universalPrice.getPrice(price);
    }
}
