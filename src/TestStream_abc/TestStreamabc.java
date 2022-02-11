package TestStream_abc;

import java.util.stream.Stream;

public class TestStreamabc {
    public static void main(String[] args) throws Exception {

        try {
            String[] catNames = {"Васька", "Барсик", "Мурзик"};
            catNames[3] = "Рыжик";

            int result = 1 / 0;
        }
        catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            //System.out.println("ArrayIndexOutOfBoundsException");
        }

        catch (Exception e) {
            System.out.println("Exception");
        }

        finally {
            System.out.println(2/1);
        }

//        try {
//            throw new NullPointerException();
//        } catch (RuntimeException ex) {
//            System.out.println("RunTimeException");
//        } catch (Exception x) {
//            System.out.println("Exception");
//        } finally {
//            System.out.println("finally");
//        }



    }
}
