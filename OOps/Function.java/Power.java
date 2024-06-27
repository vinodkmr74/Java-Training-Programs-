import java.util.Scanner;

public class Power {

    static void ispower(int n, int p) {

        int ans = 1;

        for (int i = 1; i <= p; i++) {
            ans = ans * n;
        }
        System.out.println(ans);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num");
        int n = sc.nextInt();

        System.out.println("power");
        int p = sc.nextInt();
        ispower(n, p);
    }

}
