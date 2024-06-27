import java.util.Scanner;

public class Palindrom {

    static int isReverse(int n) {
        int rev = 0;
        while (n > 0) {

            rev = rev * 10 + n % 10;

            n = n / 10;
        }
        return rev;

    }

    static void isPalindrom(int n) {

        int revers = isReverse(n);

        if (revers == n) {
            System.out.println("Palindrom");
        } else {
            System.out.println("not palindrom");
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int rev = isReverse(n);
        System.out.println("rev: " + rev);

        isPalindrom(n);

    }

}