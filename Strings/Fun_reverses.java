package Strings;

class Revarsestr {

    void printreverse(String str) {
        for (int i = str.length() - 1; i > 0; i--) {
            System.out.print(str.charAt(i));
        }
    }

}

public class Fun_reverses {

    public static void main(String[] args) {
        String str = "noida delhi";
        Revarsestr rev = new Revarsestr();
        rev.printreverse(str);

    }
}