public class Even_odd_multi {

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("even of: " + arr[i] * 2);
            } else if (arr[i] % 2 == 1) {
                System.out.println("Odd of: " + arr[i] * 3);
            }
        }
    }
}
