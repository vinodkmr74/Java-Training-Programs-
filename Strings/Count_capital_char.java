package Strings;

public class Count_capital_char {

    public static void main(String args[]) {
        String str = "Count Capital Character In Java";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                count++;

            }

        }
        System.out.println("Capital char: " + count);
    }

}
