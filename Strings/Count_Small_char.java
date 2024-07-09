package Strings;

public class Count_Small_char {

    public static void main(String args[]) {
        String str = "Count Small Character In Java";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                count++;

            }

        }
        System.out.println("Small char: " + count);
    }

}
