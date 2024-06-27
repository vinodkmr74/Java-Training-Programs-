package Switch_Case;

import java.util.Scanner;

public class One_fine {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("one" + 1);
                break;
            case 2:
                System.out.println(" two" + 2);
                break;
            case 3:
                System.out.println("three" + 3);
                break;
            case 4:
                System.out.println("four" + 4);
            case 5:
                System.out.println("five" + 5);
                break;
            default:

                System.out.println("invalid number");
        }
    }
}
