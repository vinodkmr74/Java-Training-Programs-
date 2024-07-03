
public class Search {

    public static void main(String args[]) {

        int arr[] = { 10, 20, 40, 80, 60 };
        int search_elem = 1;
        boolean b = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search_elem) {
                System.out.println("found");
                b = false;
                break;
            }
        }

        if (b) {
            System.out.println("not found");
        }
    }

}