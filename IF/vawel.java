package IF;

import java.util.Scanner;

public class vawel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char");
        char n = sc.next().charAt(0);
        if (n == 'a') {
            System.out.println("A: vawel");
        } else if (n == 'e') {
            System.out.println("E: vawel");
        } else if (n == 'i') {
            System.out.println("I: vawel");

        } else if (n == 'o') {
            System.out.println("O: vawel");
        } else if (n == 'u') {
            System.out.println("U: vawel");
        } else {
            System.out.println("consonent");
        }

    }

}
