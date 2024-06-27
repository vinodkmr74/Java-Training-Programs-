package For_loop;

public class Revarce {

    public static void main(String args[]) {

        int n = 23123;
        int rev = 0;

        for (int i = n; i > 0; i = i / 10) {

            {
                rev = rev * 10 + i % 10;
            }
        }
        System.out.println("\n" + rev);

    }
}