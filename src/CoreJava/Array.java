package CoreJava;

import java.util.Arrays;

public class Array {

// What is array

/*    Array storing multiple variables
*/

// how to create it
    void se(){
        int[] i = new int[3];
        i[0] = 2;
        i[1] = 3;
        i[3] = 10;

        String[] s1 = new String[]{"new jersey" , "dc" , "atlanta", "new york" };

        for(int i1 = 0 ; i1 < s1.length ; i1++){

            System.out.println(s1[i1]);

        }

    }


//   if array has 0 change it to -1
    static void change0to1(int[] my_array){

        System.out.println("before change ");
        for(int i = 0 ; i <my_array.length ; i++){

            System.out.print(my_array[i] + "   ");

            if(my_array[i]==0){

                my_array[i]=-1;

            }

        }
        System.out.println();
        System.out.println("after change");
        for(int i = 0 ; i <my_array.length ; i++){

            System.out.print(my_array[i] + "   ");

        }
    }

/*

Intersection of two arrays means finding out common elements or matching elements .

    array1  contains { 0 ,  1 , 2 ,  3  }
    array2  contains  {  3  , 10 , 1 }


    Then intersection of array1 and array2 will be :    { 1 , 3  }
 */

    static void intersection(int x[],int y[])
    {

        int c=0;

        int []z=new int[x.length+y.length];

        for( int i=0;i <(x.length);i++)
        {
            for(int  j=0;j < y.length;j++)
            {
                if(x[i]==y[j])
                {
                    z[c]=x[i];

                c++;
                }

                else
                    continue;

            }
        }
        System.out.println("Intersection of two  array is " +"  ");
        for(int k=0;k < c;k++)
        {
            System.out.print("  "+z[k]+" ");
        }
        System.out.println("            ");
    }




    public static void main(String[] args)
    {
        int[] x= {2,5,1,3,7};
        int[] y={5,2,9,0,1};
        intersection(x,y);

        change0to1(new int[] {10,0, 10, 0, 11, 22});

    }




}
