/**
 * Palindrom
 */
public class Palindrom {

    public static void main(String args[]) {

        String str = "abba";
        String str1 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            str1 = str1 + ch;

        }
        if (str.equals(str1)) {
            System.out.println("palindrom");
        } else

        {

            System.out.println("not paindrom");
        }
    }
}