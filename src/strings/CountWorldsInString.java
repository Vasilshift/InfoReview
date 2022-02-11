package strings;

import java.util.HashMap;
//Подсчет количества конкретных слов в строке, используя HashMap

public class CountWorldsInString {
    public static void main(String[] args) {
        String st = "Current task gty gty";
        String[] words = st.split(" ");

        HashMap<String,Integer> keyValue = new HashMap<String,Integer>();

        System.out.println(words.length);

        for (int i=0; i<= words.length-1; i++) {

            if (keyValue.containsKey(words[i])) {
                int counter = keyValue.get(words[i]);
                keyValue.put(words[i], counter+1);
            } else {

                keyValue.put(words[i], 1);
            }
        }
        System.out.println(keyValue);
    }
}
