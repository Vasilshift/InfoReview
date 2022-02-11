package EXCEPTIONS;

import java.io.IOException;

public class MyExceptionClass extends Exception {
    String textException;

    public MyExceptionClass(String textException) {
        this.textException = textException;
        System.out.println("Throwing exception from constructor ... ");
    }

    public MyExceptionClass() {

    }

    public void MyOwnExceptionMethod() {
        System.err.println("This is exception from method ... ");
    }
}
