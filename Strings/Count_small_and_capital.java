/**
 * Count_small_and_capital
 */
public class Count_small_and_capital {

    public static void main(String[] args) {

        String str = "VINOD kumar Singh";

        int small = 0;
        int capital = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                capital++;
            } else if (ch >= 'a' && ch <= 'z') {

                small++;
            }
        }
        System.out.println("capital: " + capital);
        System.out.println("small: " + small);
    }
}