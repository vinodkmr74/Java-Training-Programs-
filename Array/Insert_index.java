
public class Insert_index {

    public static void main(String[] args) {

        int arr[] = { 10, 40, 50, 60, 70, 80, 90 };

        // this is index base (not position)
        // last element delete hota h
        int ele = 2000;
        int index = 1;
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }

        arr[index] = ele;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}