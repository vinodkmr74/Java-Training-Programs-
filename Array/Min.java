
public class Min {

    public static void main(String[] args) {

        int arr[] = { 10, 50, 60, 40, 5, 500 };
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("mix: "+min);
    }
}
