import java.util.Scanner;

/**
 * Pen
 */
public class Pen {

    public static void main(String args[])

    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pen cost");
        int pen = sc.nextInt();
        int total = pen * 70;
        System.out.println("total cost:" + total);
        if (total > 1000) {

            int dis = total * 20 / 100;

            System.out.println("discaunt:" + dis);
            System.out.println("total_dis: " + (total - dis));
        } else if (total < 1000) {
            int dis1 = total * 10 / 100;

            System.out.println("discaunt1:" + dis1);
            System.out.println("total_dis:" + (total - dis1));
        }

    }
}