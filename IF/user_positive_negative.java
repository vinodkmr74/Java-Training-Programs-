package IF;

import java.util.Scanner;

public class user_positive_negative {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if (n > 0) {
            System.out.println("number is positive");
        } else {
            System.out.println("number is negative");
        }
    }

}
