package oop4;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    void main() {

        Map<String, String> map = new HashMap<>();

        System.out.println("A".hashCode() % 16);
        System.out.println("B".hashCode() % 16);
        System.out.println("Q".hashCode() % 16);

        map.put("A", "The letter A is the first in the alphabet. Used to form words like ape and advocate.");
        map.put("B", "B comes second but is still a nice letter. Used to form Bapelsin.");
        System.out.println(map.get("A"));
        System.out.println(map.get("B"));
        if (map.containsKey("C"))
            System.out.println(map.get("C"));

    }
}














