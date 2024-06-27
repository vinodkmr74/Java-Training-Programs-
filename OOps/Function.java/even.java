import java.util.Scanner;

public class even {

    static void iseven(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println("even: " + i);
            } else {
                System.out.println("odd: " + i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        iseven(n);

    }

}
