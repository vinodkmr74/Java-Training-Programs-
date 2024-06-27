package IF;

import java.util.Scanner;

public class Day {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Day number");
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("manday");

        } else if (n == 2) {
            System.out.println("tuaday");

        } else if (n == 3) {
            System.out.println("wednesday");
        } else if (n == 4) {
            System.out.println("thuaday");
        } else if (n == 5) {
            System.out.println("friday");

        } else if (n == 6) {
            System.out.println("Saturdaay");
        } else if (n == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("invalid number");
        }
    }

}