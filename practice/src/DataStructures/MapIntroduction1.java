package DataStructures;

import java.util.HashMap;

public class MapIntroduction1 {
    public static void main(String[] args) {
        //Create an empty map where the keys are integers and the values are characters
        //Print out whether the map is empty or not
        //Add the following key-value pairs to the map

        HashMap<Integer, String> map = new HashMap<>();
        System.out.println(map.isEmpty());
        map.put(97,"a");
        map.put(98, "b");
        map.put(99, "c");
        map.put(65, "A");
        map.put(66, "B");
        map.put(67, "C");
        //Print all the keys
        for (int i: map.keySet()) {
            System.out.println(i);
        }
        for (String s: map.values()) {
            System.out.println(s);
        }
        //Add value D with the key 68
        map.put(68, "D");
        //Print how many key-value pairs are in the map
        System.out.println(map.size());
        //Print the value that is associated with key 99
        String value = map.get(99);
        System.out.println(value);
        //Remove the key-value pair where with key 97
        map.remove(97);
        System.out.println(map.size());
        //Print whether there is an associated value with key 100 or not
        if(map.containsKey(100)) {
            System.out.println("yes, there is");
        } else System.out.println("nope, there isn't 100");
        //Remove all the key-value pairs
        map.clear();
        System.out.println(map.size());
    }
}
