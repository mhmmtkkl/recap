package CoreJava;

import java.util.HashMap;
import java.util.TreeMap;

public class Map2 {

    // What is Map

//



//    Write a Java program to test if a map contains a mapping for the specified key.

    public static void main(String args[]) {
        HashMap<String, Integer> hash_map = new HashMap<String, Integer>();
        hash_map.put("Red", 1);
        hash_map.put("Green", 2);
        hash_map.put("Black", 3);
        hash_map.put("White", 4);
        hash_map.put("Blue", 5);
        // print the map
        System.out.println("The Original map: " + hash_map);
        System.out.println("1. Is key 'Green' exists?");
        if (hash_map.containsKey("Green")) {
            //key exists
            System.out.println("yes! - " + hash_map.get("Green"));
        } else {
            //key does not exists
            System.out.println("no!");
        }

        System.out.println("\n2. Is key 'orange' exists?");
        if (hash_map.containsKey("orange")) {
            System.out.println("yes! - " + hash_map.get("orange"));
        } else {
            System.out.println("no!");
        }
    }


}

class Example4 {

    //    Write a Java program to search a value in a Tree Map

    public static void main(String args[]) {

        // Create a tree map
        TreeMap<String, String> tree_map1 = new TreeMap<String, String>();

        // Put elements to the map
        tree_map1.put("C1", "Red");
        tree_map1.put("C2", "Green");
        tree_map1.put("C3", "Black");
        tree_map1.put("C4", "White");

        if (tree_map1.containsValue("Green")) {
            System.out.println("The TreeMap contains value Green");
        } else {
            System.out.println("The TreeMap does not contain value Green");
        }
        if (tree_map1.containsValue("Pink")) {
            System.out.println("The TreeMap contains value Pink");
        } else {
            System.out.println("The TreeMap does not contain value Pink");
        }
    }
}