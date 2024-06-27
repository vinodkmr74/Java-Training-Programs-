package IF.AND_OR;

public class Max {

    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;

        if (a > b && a > c) {
            System.out.println(a + "a is max");
        } else if (b > a && b > c) {
            System.out.println(b + "a is max");

        } else {
            System.out.println(c + " c is max");
        }
    }

}
