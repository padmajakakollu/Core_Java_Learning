package Com.Day2_Arrays;
//Write a program to reverse the elements of an array.
public class Array_Reverse {
    public static void main(String[] args) {

         int[] number = {1,2,3,4,5};
         for(int i=0;i<number.length;i++) {
             System.out.println(number[i]);


         }
        System.out.println("The array length is " +number.length);
        for (int i = number.length-1; i >= 0; i--) {
            System.out.print(number[i] +" ");
        }
    }
}
