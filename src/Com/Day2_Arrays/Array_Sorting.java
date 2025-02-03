package Com.Day2_Arrays;

import java.util.Arrays;

//Create an array of names. Sort the names in alphabetical order and print the sorted list.
public class Array_Sorting {
    public static void main(String[] args) {
        String[] names = {"Alex","David","Peter","Bob"};
        Arrays.sort(names);

        for(int i=0;i<names.length;i++){
            System.out.println("The name are : " +names[i]);


        }

    }
}
