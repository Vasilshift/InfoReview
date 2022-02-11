import java.io.*;

public class MainCloneSerial {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        PersonC personC = new PersonC(15, "Nail");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);

        objectOutputStream.writeObject(personC);
        objectOutputStream.close();

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);

        PersonC clonePersonC = (PersonC) objectInputStream.readObject();

        System.out.println("personC original: " + personC.getName());
        clonePersonC.setName("New Name");
        System.out.println("clonePersonC: " + clonePersonC.getName());

    }
}
