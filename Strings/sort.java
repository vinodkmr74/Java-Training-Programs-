package Strings;

public class sort {

    public static void main(String[] args) {

        String str[] = { "vinod", "kumar", "barsha", "ravi", "avinash" };

        for (int i = 0; i < str.length - 1; i++) {
            for (int j = i + 1; j < str.length; j++) {

                if (str[i].compareTo(str[j]) > 0) {
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }

            }
        }
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }
    }
}