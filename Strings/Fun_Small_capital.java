package Strings;

class Small_capital {

    void smallCase(String str) {

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                int asci = str.charAt(i) + 32;
                char ch = (char) asci;
                System.out.println(ch);
            } else {
                System.out.println(str.charAt(i));
            }
        }

    }

    void capitalCase(String str) {

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                int asci = str.charAt(i) - 32;
                char ch = (char) asci;
                System.out.println(ch);
            } else {
                System.out.println(str.charAt(i));
            }
        }

    }

}

public class Fun_Small_capital {

    public static void main(String[] args) {

        String str = "vinod sinhg";

        Small_capital obj = new Small_capital();
        obj.smallCase(str);
        System.out.println("..................................");
        obj.capitalCase(str);

    }

}
