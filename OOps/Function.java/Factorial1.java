import java.util.Scanner;

public class Factorial1 {

    static int isFactorial(int n) {

        for (int i = n - 1; i >= 1; i--) {
            n = n * i;
        }
        return n;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        System.out.println(isFactorial(n));
    }
}
