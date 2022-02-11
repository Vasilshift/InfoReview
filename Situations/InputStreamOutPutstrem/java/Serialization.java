import java.io.*;

public class Serialization {
    public static void main(String[] args) throws IOException {

        Person1 personXXX = new Person1( 25, "ghy", 154);

        FileOutputStream fileOutputStream = new FileOutputStream(new File("C:/Users/vasil/Downloads/123.bin"));

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(personXXX);

        objectOutputStream.flush();

        objectOutputStream.close();


    }
}
