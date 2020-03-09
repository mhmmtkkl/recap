package CoreJava;

import java.util.HashMap;

public class map1 {

    public static void main(String[] args) {

//        create a map and print them one by one

        HashMap<Integer, String> m1  = new HashMap<>();

        m1.put(1,"tr");
        m1.put(2,"tr2");
        m1.put(4,"tr3");
        m1.put(3,"tr4");
        m1.put(5,"tr5");

        System.out.println(m1.get(2));

        for(String vlues:m1.values()){

            System.out.println(vlues);

        }

    }
}
