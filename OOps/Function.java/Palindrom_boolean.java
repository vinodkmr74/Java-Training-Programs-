import java.util.Scanner;

public class Palindrom_boolean {

    static int isReverse(int n) {
        int rev = 0;
        while (n > 0) {

            rev = rev * 10 + n % 10;

            n = n / 10;
        }
        return rev;

    }

    static boolean isPalindrom(int n) {

        int revers = isReverse(n);

        if (revers == n) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        isReverse(n);

        boolean bb = isPalindrom(n);

        if (bb) {
            System.out.println("palindrom");
        } else {
            System.out.println("not");
        }

    }

}
