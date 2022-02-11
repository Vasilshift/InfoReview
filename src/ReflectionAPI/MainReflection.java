package ReflectionAPI;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MainReflection {
    public static void main(String[] args) throws ClassNotFoundException {
        Person1712 person = new Person1712();

        Class<? extends Person1712> personClass = person.getClass();
        //Class<? extends Person1712> personClass1 = (Class<? extends Person1712>) Class.forName("Person");
        //Class<? extends Person1712> personClass3 = Person1712.class;

        Method[] methods = personClass.getMethods();

        for (Method method : methods) {
            System.out.println(method.getName());
        }

        Field[] fields = personClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("fields: " + field.getName());
        }


    }
}
