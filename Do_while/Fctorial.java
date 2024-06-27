package Do_while;

public class Fctorial {
    public static void main(String args[]) {
        int n = 5;
        int i = n - 1;
        do {
            n = n * i;
            i--;
        } while (i > 1);
        System.out.println(n);
    }

}
