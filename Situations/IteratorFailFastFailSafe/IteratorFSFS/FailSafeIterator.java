import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeIterator {
    public static void main(String[] args) {
        // Создание ConcurrentHashMap
        ConcurrentHashMap<String, Integer> map =
                new ConcurrentHashMap<String, Integer>();

        // Добавляем элементы на карту
        map.put("ONE", 1);
        map.put("TWO", 2);
        map.put("THREE", 3);

        // Получение итератора из карты
        Iterator<String> it = map.keySet().iterator();

        while (it.hasNext()) {
            String key = (String) it.next();
            System.out.println(key+" : "+map.get(key));
            // Это не будет отражено в Iterator
            map.put("FOUR", 4);
        }
    }
}
