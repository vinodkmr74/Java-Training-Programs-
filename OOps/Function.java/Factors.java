import java.util.Scanner;

public class Factors {
    static void isfacters(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println("Facters: " + i);
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        isfacters(n);
    }

}