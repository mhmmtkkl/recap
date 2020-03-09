package CoreJava;

import java.util.HashSet;

public class Set {


// What is Set
//    Set is not taking the duplicate values and only one null value

/*
   HashSet vs TreeSet vs linkedhashset

Order Of Elements
HashSet doesn’t maintain any order of elements.
LinkedHashSet maintains insertion order of elements. i.e elements are placed as they are inserted.
TreeSet orders the elements according to supplied Comparator. If no comparator is supplied, elements will be placed in their natural ascending order.

Null elements
HashSet allows maximum one null element.
LinkedHashSet also allows maximum one null element.
TreeSet doesn’t allow even a single null element. If you try to insert null element into TreeSet, it throws NullPointerException.

Performance
HashSet gives better performance than the LinkedHashSet and TreeSet.
The performance of LinkedHashSet is between HashSet and TreeSet. It’s performance is almost similar to HashSet. But slightly in the slower side as it also maintains LinkedList internally to maintain the insertion order of elements.
TreeSet gives less performance than the HashSet and LinkedHashSet as it has to sort the elements after each insertion and removal operations.

*/


//    compare two hash set
public static void main(String[] args) {
    // Create a empty hash set
    HashSet<String> h_set = new HashSet<String>();
    // use add() method to add values in the hash set
    h_set.add("Red");
    h_set.add("Green");
    h_set.add("Black");
    h_set.add("White");

    HashSet<String>h_set2 = new HashSet<String>();
    h_set2.add("Red");
    h_set2.add("Pink");
    h_set2.add("Black");
    h_set2.add("Orange");
    //comparison output in hash set
    HashSet<String>result_set = new HashSet<String>();
    for (String element : h_set){
        System.out.println(h_set2.contains(element) ? "Yes" : "No");
    }
}






}
