package For_loop;

public class Fctorial {
    public static void main(String args[]) {
        int n = 5;
        for (int i = n - 1; i >= 1; i--) {
            n = n * i;

        }
        System.out.println(n);
    }

}
