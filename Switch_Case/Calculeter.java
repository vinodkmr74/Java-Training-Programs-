package Switch_Case;

import java.util.Scanner;

public class Calculeter {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter secand number: ");
        int b = sc.nextInt();
        System.out.println("Enter solv: =");
        int solv = sc.nextInt();
        // int a = 10, b = 20;
        switch (solv) {
            case 1:
                System.out.println("add: " + (a + b));

                break;
            case 2:
                System.out.println("subtection: " + (a - b));
                break;
            case 3:
                System.out.println("multi: " + a * b);
                break;
            case 4:
                System.out.println("div: " + a / b);
                break;

            default:
                System.out.println("not !:");
                break;
        }

    }

}
