
public class Fun_word {

    static void wordCount(String str) {
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                count++;

            }
        }
        System.out.println("count: " + count);

    }

    public static void main(String args[]) {
        String str = "this is a pen sgs";
        wordCount(str);

    }
}