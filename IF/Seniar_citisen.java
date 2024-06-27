package IF;

import java.util.Scanner;

public class Seniar_citisen {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a age");
        int n = sc.nextInt();
        if (n > 50) {
            System.out.println("Seniar citizan");
        } else {
            System.out.println("not seniae citizan");
        }
    }

}
