public class Delete {

    public static void main(String args[]) {

        int arr[] = { 10, 20, 30, 40, 50 };
        int Del = 30;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == Del) {
                for (int j = i; j < arr.length - 1; j++) {

                    arr[i] = arr[i + 1];
                }
                break;

            }

        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }

}
