import java.util.Scanner;

public class Negetive {

    void isNegetive(int n) {
        if (n > 0) {
            System.out.println("positive: " + n);
        } else {
            System.out.println("Negetive: " + n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        int n = sc.nextInt();
        Negetive nn = new Negetive();
        nn.isNegetive(n);

    }

}
