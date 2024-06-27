//package For_Loop;

import java.util.Scanner;

public class For_loop4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {

                System.out.println(i);
            }
        }

    }

}