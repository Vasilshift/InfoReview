package PATTERNS.visitor;
// смысл паттерна в создании прослойки интерфейса для динамического изменения кода
//  в реализационных классах (классах наследниках)
public class Main {
    public static void main(String[] args) {
        Bank bank = new MoscowBank();
        bank.openAccount(new concreteVisitor());
        Bank bank1 = new NordeaBank();
        bank1.openAccount(new concreteVisitor());
    }
}

interface Bank {
    public void openAccount(Visitor visitor);
}

class NordeaBank implements Bank {
    @Override
    public void openAccount(Visitor visitor) {
        visitor.openAccountNordeaBank();
    }
}

class MoscowBank implements Bank {
    @Override
    public void openAccount(Visitor visitor) {
        visitor.openAccountMoscowBank();
    }
}

interface Visitor {
    void openAccountMoscowBank();
    void openAccountNordeaBank();
}

class concreteVisitor implements Visitor {
    @Override
    public void openAccountMoscowBank() {
        System.out.println("Opening account in Moscow Bank ... ");
    }

    @Override
    public void openAccountNordeaBank() {
        System.out.println("Opening account in Nordea Bank ... ");
    }
}