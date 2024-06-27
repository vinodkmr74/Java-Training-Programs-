package IF.AND_OR;

import java.util.Scanner;

public class Vawel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter vawel");
        char ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'A') {
            System.out.println("a is vawel: " + ch);
        } else if (ch == 'e' || ch == 'E') {
            System.out.println("e is vawel: " + ch);
        } else if (ch == 'i' || ch == 'I') {
            System.out.println("i is vawel: " + ch);
        } else if (ch == 'o' || ch == 'O') {
            System.out.println("o is vawel: " + ch);
        } else if (ch == 'u' || ch == 'U') {

            System.out.println("u is vawel: " + ch);
        } else {
            System.out.println("consonent is: " + ch);
        }

    }

}
