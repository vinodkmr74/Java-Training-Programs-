package Strings;

/**
 * Chenge_capital
 */
public class Chenge_capital {

    public static void main(String[] args) {

        String str = "java is programming language";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                int asci = str.charAt(i) - 32;
                char ch = (char) asci;
                System.out.print(ch);

            } else {
                System.out.println(str.charAt(i));
            }
        }
    }
}