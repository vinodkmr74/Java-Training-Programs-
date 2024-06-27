import java.util.*;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a nubber");
        int pen = sc.nextInt();
        pen = pen * 70;
        // int year = sc.nextInt();

        if (pen >= 1000) {

            int pr = pen * 20 / 100;
            System.out.println(pr);
            int total = pr + pen;
            System.out.println("20% discaunt" + total);
        } else if (pen <= 1000) {
            int pr = pen * 10 / 100;
            System.out.println(pr);
            int total = pr + pen;
            System.out.println("10 discaunt" + total);
        }

    }

}
