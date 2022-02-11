package EXCEPTIONS;
//создание собственного исключения
public class Main1 {
    public static void main(String[] args) throws MyExceptionClass {

        try {
            String s = "some string";
            throw new MyExceptionClass(s);
        } catch (MyExceptionClass msg) {
            msg.MyOwnExceptionMethod();
            //throw new MyExceptionClass();
        }

    }
}
