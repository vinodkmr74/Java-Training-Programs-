package Tow_D_Arrary;

public class D_count {

    public static void main(String[] args) {

        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                count++;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("count of: " + count);
    }

}
