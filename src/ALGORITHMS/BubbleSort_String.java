package ALGORITHMS;

public class BubbleSort_String {
    public static void main(String[] args) {
        String[] poem = { "a", "z", "g", "b", "e" };

        for (int j = 0; j < poem.length; j++) {
            for (int i = j + 1; i < poem.length; i++) {
                if (poem[i].compareTo(poem[j]) < 0) {
                    String temp = poem[j];
                    poem[j] = poem[i];
                    poem[i] = temp;
                }
            }
        System.out.println(poem[j]);
        }

    }
}
