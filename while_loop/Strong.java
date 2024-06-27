public class Strong {

    public static void main(String[] args) {
        int n = 145;
        int sum = 0;
        int fct = 0;
        int d = 0;

        while (n > 0) {
            d = n % 10;
            n = n / 10;
            // System.out.println(d);

            for (int i = 1; i <= d; i++) {
                fct = fct * i;
            }
            sum = sum + fct;
        }
        System.out.println(sum);

        // sum=sum+d;
        // System.out.println(d);
    }
}
