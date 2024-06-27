package Do_while;

public class Revarce {

    public static void main(String args[]) {

        int n = 83125;
        int rev = 0;
        int i = n;

        do {

            rev = rev * 10 + i % 10;

            i = i / 10;

        } while (i > 0);
        System.out.println("\n" + rev);

    }
}