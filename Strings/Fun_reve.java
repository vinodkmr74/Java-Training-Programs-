package Strings;

class Reverse {

    void Reverseprint(String str) {
        for (int i = str.length() - 1; i >= 0; i++) {
            System.out.println(str.charAt(i));

        }
    }

}

public class Fun_reverse {

    public static void main(String args[]) {

        String str = "vikash singh";
        Reverse reverse = new Reverse();
        reverse.Reverseprint(str);

    }

}
