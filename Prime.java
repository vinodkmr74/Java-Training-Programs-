import java.util.*;

public class Prime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();

        int count = 0, sum = 0;

        for (int i = n; i > 0; i--) {

            if (n % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println("is prime: " + n);
        } else {
            System.out.println("not");
        }

    }

}
