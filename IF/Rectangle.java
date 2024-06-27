import java.util.Scanner;

public class Rectangle {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length and breadth");

        int l = sc.nextInt();
        int b = sc.nextInt();
        if (l == b) {
            System.out.println("Rectangle");
        } else {
            System.out.println("squere");
        }
    }

}
