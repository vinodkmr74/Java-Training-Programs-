
public class Comparear {

    public static void main(String[] args) {
        String str = "ab";
        String str1 = "AB";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {

                int a = (str.compareTo(str1));

                System.out.println(a);

            }
        }

        // if (str.equals(str1)) {
        // System.out.println("equal");
        // } else {
        // System.out.println("not equal");
        // }

    }
}
