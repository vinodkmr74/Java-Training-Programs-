import java.util.Scanner;

public class Factorial {

    static void isFactorial(int n) {

        for (int i = n - 1; i >= 1; i--) {
            n = n * i;
        }
        System.out.println(n);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        isFactorial(n);
    }
}
