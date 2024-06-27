import java.util.Scanner;

public class Prime1 {

    public static void isPrime(int n) {

        int i = 1;
        int count = 0;
        while (i <= n) {
            if (n % i == 0) {
                count++;
            }
            i++;
        }

        if (count == 2)

        {
            System.out.println("prime");
        } else {
            System.out.println("Not");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        isPrime(n);

    }

}
