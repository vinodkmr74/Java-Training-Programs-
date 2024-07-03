
public class Even_odd_count {

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int ecount = 0;
        int Odcount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {

                ecount++;
            }

            else if (arr[i] % 2 == 1) {

                Odcount++;
            }
        }
        System.out.println("even count of: " + ecount);
        System.out.println("odd count of: " + Odcount);
    }
}
