package IF;

import java.util.Scanner;

public class Use_Age_greater {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Age");
        int n = sc.nextInt();
        if (n > 18) {
            System.out.println("Age is greater");
        } else {
            System.out.println("Age is not greater");
        }
    }

}
