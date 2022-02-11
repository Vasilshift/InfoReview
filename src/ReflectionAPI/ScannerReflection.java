package ReflectionAPI;

import java.lang.reflect.Method;
import java.util.Scanner;

public class ScannerReflection {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Scanner scanner = new Scanner(System.in);

        Class<?> objectClass = Class.forName(scanner.next());
        Class<?> objectClass2 = Class.forName(scanner.next());
        String methodName = scanner.next();

        Method m = objectClass.getMethod(methodName, objectClass2);
        Object o1 = objectClass.newInstance();





    }
}
