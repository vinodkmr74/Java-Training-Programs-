package Strings;

public class Chenge_small {

    public static void main(String args[]) {
        String str = "PRogaramming language";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {

                int acsi = str.charAt(i) + 32;
                char ch = (char) acsi;
                System.out.println(ch);
            } else {
                System.out.println(str.charAt(i));
            }
        }

    }

}