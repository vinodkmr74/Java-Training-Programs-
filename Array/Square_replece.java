public class Square_replece {

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

        int square;
        for (int i = 0; i < arr.length; i++) {
            square = arr[i] * arr[i];

            System.out.println("square of: " + square);
        }
    }
}
