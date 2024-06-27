import java.util.Scanner;

public class Prime_boolean {

    static int isPrime(int n) {

        int i = 1;
        int count = 0;
        while (i <= n) {
            if (n % i == 0) {
                count++;
            }
            i++;
        }
        return count;
    }

    static boolean facter(int n) {

        int count = isPrime(n);
        if (count == 2)

        {
            return true;

        } else {
            return true;

        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        isPrime(n);
        boolean pp = facter(n);

        if (pp) {
            System.out.println("prime");
        } else {
            System.out.println("not");
        }
    }

}
