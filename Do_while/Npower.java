package Do_while;

public class Npower {

    public static void main(String args[]) {
        int n = 4;
        int p = 3;
        int i = 1;

        do {

            n = n * 4;
            // System.out.println(n);
            i++;
        } while (i < p);
        System.out.println(n);

    }
}
