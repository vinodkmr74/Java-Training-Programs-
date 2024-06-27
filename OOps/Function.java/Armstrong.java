import java.util.Scanner;

public class Armstrong {

    static int digitCount(int n) {

        int count = 0;
        for (int i = n; i > 0; i = i / 10) {
            count++;
        }
        return count;
    }

    static int isremander(int n)

    {
        int rem = 0;

        for (int i = n; i >= 0; i = i / 10) {
            rem = i % 10;
        }
        return rem;

    }

    static void ispower(int n) {
        int counts = digitCount(n);
        int remanders = isremander(n);

        int pow = 0, sum = 0;
        {
            pow = 1;
            for (int p = 1; p <= counts; p++) {

                pow = pow * n;
            }
            sum = sum + pow;

        }
        if (sum == n) {
            System.out.println("Armstrong");
        } else {
            System.out.println("not");
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        digitCount(n);
        isremander(n);
        ispower(n);
        // isArm(n);

    }

}
