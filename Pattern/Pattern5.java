package Pattern;

public class Pattern5 {

    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(row + " ");
            }

            System.out.println();
        }
    }

}
