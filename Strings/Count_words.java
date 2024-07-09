package Strings;

public class Count_words {

    public static void main(String[] args) {

        String str = "java is object orianted programing language";

        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {

                count++;

            }
        }
        System.out.println("count words: " + count);
    }

}
