package Do_while;

public class Series {
    public static void main(String[] args) {

        int n = 5;
        int i = 1;
        do {
            System.out.print(i);
            System.out.println("#");
            System.out.println(n);
            i++;
            n--;
        } while (i <= 5);

    }
}
