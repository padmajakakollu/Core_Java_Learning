package Com.Day2_Strings;

import java.util.Locale;

public class Reverse_String {
    public static void main(String[] args) {
        String name ="ABCD";

        System.out.println("Length of the String is " +name.length());

        String Reverse = " ";
        String original = " ";

        String name_1 = "1234";
        int n = Integer.parseInt(name_1);
        System.out.println("Converted into integer : "+n);

        int number = 1234;
        String str1 = String.valueOf(number);
        System.out.println("Converted into String :" +number);




        String Lower_Case = name.toLowerCase();
         System.out.println(Lower_Case);
        for(int i=0;i<name.length();i++){
            original = original+ name.charAt(i);
          //  System.out.println(name.charAt(i));


        }
        System.out.println(original);


        for(int j=name.length()-1 ;j>=0;j--) {

            Reverse = Reverse + name.charAt(j);
          //  System.out.println(name.charAt(j));
        }
        System.out.println(Reverse);

        if (name.toLowerCase().equals(Reverse.toLowerCase())) {
            System.out.println(name + " is a Palindrome String.");
        }

    }
}
