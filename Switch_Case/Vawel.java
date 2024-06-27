import java.util.Scanner;

class Vawel {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char");
        char ch = sc.next().charAt(0);
        switch (ch) {
            case 'a':
                System.out.println("a is vawel: " + ch);
                break;

            case 'e':
                System.out.println("e is vawel: " + ch);
                break;

            case 'i':
                System.out.println("i is vawel: " + ch);
                break;

            case 'o':
                System.out.println("o is vawel: " + ch);
                break;

            case 'u':
                System.out.println("u is vawel:" + ch);
                break;
            default:
                System.out.println("consonnent: " + ch);
        }

    }
}