package Do_while;

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");

        int n = sc.nextInt();
        int count = 0;
        int i = 1;

        do {
            if (n % i == 0) {
                count++;
            }
            i++;
        } while (i <= n);

        if (count == 2) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }

    }

}