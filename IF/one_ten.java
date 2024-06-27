package IF;

import java.util.Scanner;

public abstract class one_ten {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("ONE");
        } else if (n == 2) {
            System.out.println("Two");
        } else if (n == 3) {
            System.out.println("Three");
        } else if (n == 4) {
            System.out.println("four");

        } else if (n == 5) {
            System.out.println("Five");

        } else if (n == 6) {
            System.out.println("six");
        } else if (n == 7) {
            System.out.println("Seven");
        } else if (n == 8) {
            System.out.println("Eight");
        } else if (n == 9) {
            System.out.println("Nine");
        } else if (n == 10) {
            System.out.println("Ten");
        } else {
            System.out.println("invalid nuumber");
        }
    }

}
