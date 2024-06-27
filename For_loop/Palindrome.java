package For_loop;

/**
 * Palindrome
 */
public class Palindrome {

    public static void main(String[] args) {
        int n = 151;
        int rew = 0;
        for (int i = n; i > 0;) {

            rew = rew * 10 + (i % 10);
            i = i / 10;
        }

        if (n == rew) {
            System.out.println("palindrome: " + rew);
        } else {
            System.out.println("not palindrome");
        }

    }
}
