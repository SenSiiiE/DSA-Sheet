package SL;

import java.util.Comparator;
import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TestTreeMap {
    public static void main(String[] args) {
        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                return num2 - num1;
            }
        };
        TreeMap<Integer, Integer> map = new TreeMap<>(comp);
        SortedMap<Integer, Integer> sortedMap = new TreeMap<>();
        map.put(10,1);
        map.put(1,1);
        map.put(79,1);
        map.put(58,1);
        map.put(11,1);
        map.put(19,1);
        map.put(90,1);
        map.put(83,2);
        map.put(109,1);
        map.put(12,1);
        map.put(31,1);
        map.put(89,1);


        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}
