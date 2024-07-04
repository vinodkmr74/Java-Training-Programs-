import java.util.Scanner;

public class Insert_user {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        int n = sc.nextInt();
        int arr[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("Enter a input pos");
        int pos = sc.nextInt();
        System.out.println("Enter input element  number");
        int ele = sc.nextInt();

        for (int i = n; i >= pos; i--) {

            arr[i] = arr[i - 1];

        }

        arr[pos - 1] = ele;
        for (int i = 0; i <= n; i++) {
            System.out.println(arr[i]);
        }

    }
}