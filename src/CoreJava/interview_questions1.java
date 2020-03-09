package CoreJava;

public class interview_questions1 {


/*

    QUESTION 1
 Count Number Of Words In The String

  Original String : "Alive is awesome "


String s = "Alive is awesome";

---> ANSWER

System.out.println(s.trim().split(" ").length);

//    answer is 3
 */


/*

    QUESTION 2

Remove Or Removing All The Whitespaces from string

---> ANSWER


  public static void main(String[] args) {

        String s1 = "ali is here";

        s1 = s1.replace(" " , "");

        System.out.println(s1);


    }
 */

/*

    QUESTION 3

Second max in the array

---> ANSWER


    public static void main(String[] args) {

        int[] arr = {2, 3,5 , 4};

        int max = 0;
        int secondMax = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }

        System.out.println(secondMax);
    }
 */

/*

 QUESTION 4

    Write a function which will take int array as input and prints two numbers in that array whose sum equals to 100?
    If there are more than 1 pair , print all.

    int[] array = { 1 , 2 , 3 , 50 , 60 ,20 , 98, 99 }

    result should be
        1  99
        2  98

---> ANSWER


 public static void main(String[] args) {

        int[] array = { 1 , 2 , 3 , 50 , 60 ,20 , 98, 99 };

        for(int i = 0 ; i< array.length/2 ; i ++){

            for(int j = 0 ; j< array.length ; j ++){

                int sum = array[i] + array[j];

                if(sum==100 && i!=j){

                    System.out.println(array[i] +" + " +array[j] +" = " + sum ) ;
                }
            }
        }
    }
 */

/*
    Question 5

    Most frequent characters
            String a = "aasssdddd";

            answer should be d
                    and count = 4


    ---> ANSWER
    int length = str

  public static void main(String[] args) {

        String str1 = "aasssdddd";

        int strLength = str1.length();

        char ch = 0;
        int count = 0;
        int max = 0;

        for (int i = 0; i < strLength; i++) {
            count = 0;

            for (int j = 0; j < strLength; j++) {

                if (str1.charAt(i) == str1.charAt(j)) {
                    count++;
                }

                if (count > max) {
                    max = count;
                    ch = str1.charAt(i);
                }
            }

        }
        System.out.println("Character is " + ch + "\nCount is " + max);
    }
 */

    /*

    QUESTIONS 6

    is palindrome

    verify word is palindrome or not

---> ANSWER

 public static void main(String[] args) {

        String str=  "word";

        if(str ==null){
            System.out.println("this is null string");
        }

        StringBuilder strBuilder = new StringBuilder();

        strBuilder.reverse();

        System.out.println(strBuilder.toString().equals(str));

    }

     */


}

