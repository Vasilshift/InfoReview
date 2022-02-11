package WildCards;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Wehicle wehicle = new Ford(4, "bosh", "Red");
        Wehicle wehicle1 = new Ford(4, "Tesla", "Blue");
        List<Wehicle> listFord = new ArrayList<>();
        listFord.add(wehicle);
        listFord.add(wehicle1);

        //MyMapWehicle<Long, Wehicle> wehicleStore = (MyMapWehicle<Long, String>) new ArrayList<Object>();

        //wehicleStore.put(15L, wehicle);




    }
}
