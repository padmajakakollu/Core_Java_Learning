package Com.Day2_Arrays;

public class Star_Pattern {
    public static void main(String[] args) {

        int row =5;
        for(int i =1;i<=row;i++) {

            for (int j = 1; j <=i; j++) {
              //   for (int j = 1; j <=row; j++){  //
                System.out.print("*");
            }

            System.out.println();

        }
    }
}
