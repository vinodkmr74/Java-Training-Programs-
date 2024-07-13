package Strings;

public class Reverse_word {

    public static void main(String[] args) {

        String str = "vinod kumar singh";

        String str1[] = str.split(" ");

        for (int i = str1.length - 1; i >= 0; i--) {

            System.out.print(str1[i] + " ");

        }

    }
}