public class Star8 {

    public static void main(String args[]) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                // if (i == 1 || i == 10 || j == 1 || j == 10 || i == j || i + j == 11) {
                if (i == 1 || i == 10 || j == 1 || j == 10 || i == 2 || i == 4 || j == 2 || i == 3) {

                    System.out.print("*" + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
// || j == 2 || j == 4