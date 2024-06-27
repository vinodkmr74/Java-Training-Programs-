package For_loop;

public class Armstrong {

    public static void main(String args[]) {

        // Digit count or //power
        int n = 153, count = 0, rem = 0, pow = 0, sum = 0;
        for (int i = n; i > 0; i = i / 10) {

            count++;
        }

        // remender
        for (int i = n; i > 0; i = i / 10) {
            rem = i % 10;

            pow = 1; // for(p 1 to count)
            for (int p = 1; p <= count; p++) {
                pow = pow * rem;

            }
            sum = sum + pow;

        }

        if (sum == n) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not");
        }
    }

}
