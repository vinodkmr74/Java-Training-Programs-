
public class Aiphanumeric {

    public static void main(String args[]) {
        String str = "vinod123";

        boolean b = true;
        for (int i = 0; i < str.length() - 1; i++) {
            char ch = str.charAt(i);

            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')) {

                System.out.println("Alphanumeric");
                b = false;
                break;

            }
        }
        if (b) {
            System.out.println("not Alphanumeric");
        }

    }
}
