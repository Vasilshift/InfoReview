import java.io.*;

public class Deserilisation {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream("C:/Users/vasil/Downloads/123.bin");

        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Person1 personXXX = (Person1) objectInputStream.readObject();

        //objectInputStream.flush();

        objectInputStream.close();

        System.out.println(personXXX.getAge());
        System.out.println(personXXX);
        System.out.println(personXXX.getFamName());
        System.out.println(PersonMain.getName());
        System.out.println(personXXX.getBrain());
        System.out.println(personXXX.getFoo());

    }
}
