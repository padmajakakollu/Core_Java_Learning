package Com.Day1;

import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows");
        int roNumber= sc.nextInt();
        for(int row = 1; row <=roNumber; row++){
            for(int column=1;column<=row; column++){
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
