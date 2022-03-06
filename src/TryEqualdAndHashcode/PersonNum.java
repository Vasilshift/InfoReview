package TryEqualdAndHashcode;

import java.util.Objects;

public class PersonNum extends Person {
    private final int salary;


    public PersonNum(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PersonNum personNum = (PersonNum) o;
        return salary == personNum.salary;
    }
}
