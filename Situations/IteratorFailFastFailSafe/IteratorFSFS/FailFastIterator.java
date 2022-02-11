import java.util.ArrayList;
import java.util.Iterator;

public class FailFastIterator {
    public static void main(String[] args) {
        // Создание ArrayList целых чисел
        ArrayList<Integer> list = new ArrayList<Integer>();

        // Добавление элементов в список
        list.add(1452);
        list.add(6854);
        list.add(8741);

        // Получение итератора из списка
        Iterator<Integer> it = list.iterator();


        System.out.println(list);

//        while (it.hasNext()) {
//            Integer integer = (Integer) it.next();
//            // Это вызовет исключение
//            // ConcurrentModificationException
//            list.add(8457);
//        }



    }
}
