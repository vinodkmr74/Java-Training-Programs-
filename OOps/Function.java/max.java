/**
 * max
 */
public class max {

    boolean ismaxx(int a, int b) {
        if (a > b) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        max mmm = new max();

        int a = 1;
        int b = 20;
        boolean bb = mmm.ismaxx(a, b);

        if (bb) {
            System.out.println("Max");
        } else {
            System.out.println("NOt");
        }
    }

}