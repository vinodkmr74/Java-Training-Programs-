public class Star5 {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == j) {
                    System.out.print("*");
                } else {
                    System.out.print("   ");
                }

            }
            // for (int j = 1; j <= 1; j++) {
            // System.out.println("*");
            // }
            System.out.println();
        }
    }

}
