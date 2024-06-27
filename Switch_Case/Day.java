package Switch_Case;

import java.util.Scanner;

/**
 * Day
 */
public class Day {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println(day + "sunday");
                break;
            case 2:
                System.out.println(day + "monday");
                break;
            case 3:
                System.out.println(day + "tuesday");
                break;
            case 4:
                System.out.println(day + "wednesday");
                break;
            case 5:
                System.out.println(day + "thursday");
                break;
            case 6:
                System.out.println(day + "friday");
                break;
            case 7:
                System.out.println(day + "saturday");
                break;
            default:
                System.out.println("invalid day");

        }
    }
}