package Strings;

public class Reverce_word2 {

    public static void main(String srgs[]) {

        String str = "object is orinted programming language";

        String word = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            char ch = str.charAt(i);
            if (ch == ' ') {

                System.out.println(str.charAt(i));
            } else {
                System.out.println(word);
            }

        }

    }

}