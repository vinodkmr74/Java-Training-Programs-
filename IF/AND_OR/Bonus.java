package IF.AND_OR;

import java.util.*;

public class Bonus {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter saraly");
        int saraly = sc.nextInt();

        System.out.println("year");
        int bonus, totalSaraly;
        int year = sc.nextInt();
        if (year > 5) {
            bonus = (saraly * 5 / 100);
            totalSaraly = bonus + saraly;
            System.out.println("bonus:" + bonus);
            System.out.println("total Saraly: " + totalSaraly);
        } else {
            System.out.println("not bonus");
        }
    }
}