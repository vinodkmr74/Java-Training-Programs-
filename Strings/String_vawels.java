package Strings;

public class String_vawels {

    public static void main(String args[]) {
        String str = "vinod kumar";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch);
            }

        }
    }
}
