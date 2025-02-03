package Com.Day2_Strings;

public class Count_Vowels {
    public static void main(String[] args) {
        String Name = "Hello World";
        int count =0;
        for(int i=0;i<Name.length();i++){
            if(Name.charAt(i) == 'a' || Name.charAt(i) == 'e'
                    || Name.charAt(i) == 'i'
                    || Name.charAt(i) == 'o'
                    || Name.charAt(i) == 'u') {
                count++;
            }

        }
        System.out.println( "Total no of vowels in string are: " + count);

    }
}
