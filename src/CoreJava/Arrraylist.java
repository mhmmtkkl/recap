package CoreJava;

import java.util.ArrayList;

public class Arrraylist {


// What is arrayList

/*
 create a Arraylist  insert add numbers if the number odd sum it if the number is even minus it

    if the array list 3,3,4

    result should be 3+3-4 = 2

 */


//    find a unique element in the arraylist.


    public static void main(String[] args) {

        ArrayList<String> stringList = new ArrayList<>();


        stringList.add("USA");
        stringList.add("France");
        stringList.add("Canada");
        stringList.add("Canada");
        stringList.add("USA");
        stringList.add("France");
        stringList.add("England");

        String result = "";

        int size = stringList.size()-1;

        System.out.println( size);
        outerloop:
        for(int i = 0 ; i < stringList.size() ; i++){

            for(int j = 0 ; j < stringList.size() ; j++){

                String i1 = stringList.get(i);
                String j1 = stringList.get(j);

                System.out.println(i1 + " "+ j + " " + result + " --" + j1 );

                if(i == size && !i1.isEmpty()) {
                    result = stringList.get(i);
                    break ;
                }else if(i == j){
                    continue ;
                }else if(i1.equals(j1)){
                    continue outerloop;
                }else if(!i1.equals(j1) && j==size ){
                    result = stringList.get(i);
                    break outerloop;
                }

            }

        }

        System.out.println(result);
    }



}
