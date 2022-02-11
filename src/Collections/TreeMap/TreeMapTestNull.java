package Collections.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTestNull {
    public static void main(String[] args) {

        Map<String, String> treeMap = new TreeMap<>();

        treeMap.put("Willis", null);
        treeMap.put("Arnold", "Schwarzenegger");
        treeMap.put("Jackie", "Chan");
        treeMap.put("Sylvester", null);
        treeMap.put("Chuck", "Norris");

        System.out.println(treeMap);

        treeMap.forEach(System.out::printf);

//        for(Map.Entry e : treeMap.entrySet()){
//            System.out.println(e.getKey()+" "+ e.getValue());
//        }


    }


}
