package Do_while;

public class Palindrom {

    public static void main(String[] args) {
        int n = 155;
        int rew = 0;
        int i = n;
        do {

            rew = rew * 10 + (i % 10);
            i = i / 10;
        } while (i > 0);

        if (n == rew) {
            System.out.println("palindrome: " + rew);
        } else {
            System.out.println("not palindrome");
        }

    }

}
