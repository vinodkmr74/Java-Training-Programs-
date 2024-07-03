public class Square {

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int square;
        for (int i = 0; i < arr.length; i++) {
            square = arr[i] * arr[i];

            System.out.println("square of: " + square);
        }
    }
}
