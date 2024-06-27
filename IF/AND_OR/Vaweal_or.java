package IF.AND_OR;

import java.util.Scanner;

public class Vaweal_or {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any char");
        char ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
                || ch == 'u' || ch == 'U') {
            System.out.println("vawel: " + ch);

        } else {
            System.out.println("consonnent: " + ch);
        }
    }
}
