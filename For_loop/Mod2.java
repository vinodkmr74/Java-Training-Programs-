package For_loop;

public class Mod2 {
    public static void main(String[] args) {
        int n = 13;
        int s = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                s++;
            }
        }
        if (s == 2) {
            System.out.println("yes");

        } else {
            System.out.println("no");
        }
    }
}
