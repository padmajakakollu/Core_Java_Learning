package Com.Day2_Arrays;

public class Array_Basics {
    public static void main(String[] args) {
        String[] food = {"pizza", "Burger", "popcorn", "ice cream"};
        int[] numbers = {1, 2, 3, 4, 45, 78};
        // int sum=0;
        for (int i = 0; i < food.length; i++) {
            System.out.println(food[i]);
        }
        int sum = 0;
        for (int j = 0; j < numbers.length; j++) {
            System.out.println(numbers[j]);
            sum += numbers[j];
            int large = numbers[0];

            int small = numbers[0];
            if (numbers[j] > large) {
                large = numbers[j];

            } else {
                if (numbers[j] > small) {
                    small = numbers[j];
                }

            }
            System.out.println("Largest number: " + large);
            System.out.println("Smallest number: " + small);

            System.out.println("Sum of the numbers are :" + sum);
            System.out.println("Length of the array is : " + numbers.length);


        }
    }
}
