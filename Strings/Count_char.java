package Strings;

/**
 * Count_char
 */
public class Count_char {

    public static void main(String args[]) {
        String str = "count character in string";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;
        }

        System.out.println("count: " + count);
    }

}