package StreamAPI.test11;

import org.springframework.beans.factory.config.BeanPostProcessor;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) {
        //foo()



    }

    static Map<User, List<Department>> foo(Company company) {
        return company.departments().collect(Collectors.groupingBy(Department::chief));
    }
}

interface User {
    String name();
}

class UserImpl implements User {
    @Override
    public String name() {
        return "Sasha";
    }
}

interface Department {
    String title();
    User chief();
    Stream<User> users();
}

class DepartmentImpl implements Department {
    @Override
    public String title() {
        return "IT";
    }

    @Override
    public User chief() {
        return null;
    }

    @Override
    public Stream<User> users() {
        return null;
    }
}


interface Company {
    Stream<Department> departments();
}
