package Com.Day2_Arrays;

import java.util.Scanner;

//Implement a function that takes an array of numbers as input and returns the average.
public class Array_Basics_exp1 {
    public static void main(String[] args) {

      /*  Scanner obj = new Scanner(System.in);
        System.out.println("Enter numbers");

        int n = obj.nextInt();
        int[] number = new int[n];
        System.out.println("Enter numbers" +n);
        for(int i=0;i<number.length;i++){
            System.out.println("Enter numbers" +i);

        } */




                Scanner obj = new Scanner(System.in);

                // Prompt the user for the number of elements
                System.out.print("Enter the number of elements: ");
                int n = obj.nextInt();  // Read the size of the array

                // Create an array to store the numbers
                int[] number = new int[n];

                // Prompt the user to enter the numbers
                System.out.println("Enter " + n + " numbers:");

                // Read each number and store it in the array
                for (int i = 0; i < n; i++) {
                    number[i] = obj.nextInt();
                }

                // Display the entered numbers (optional)
                System.out.println("You entered the following numbers:");
                for (int num : number) {
                    System.out.print(num + " ");
                }

                // Close the scanner
                obj.close();
            }
        }





