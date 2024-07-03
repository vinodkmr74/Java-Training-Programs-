
public class Multi {

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int multi = 1;
        for (int i = 0; i < arr.length; i++) {
            multi = multi * arr[i];
        }

        System.out.println("Multi of: " + multi);
    }
}