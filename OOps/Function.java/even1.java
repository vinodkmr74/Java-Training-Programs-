import java.util.*;;

public class even1 {

    static boolean iseven(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        boolean bb = iseven(n);
        if (bb) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

}
