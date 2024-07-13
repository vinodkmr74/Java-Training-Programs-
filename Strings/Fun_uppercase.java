package Strings;

class Uppercase {
    void upperprint(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
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

public class Fun_uppercase {

    public static void main(String[] args) {

        String str = "it self colling is call recursion";
        Uppercase uppercase = new Uppercase();
        uppercase.upperprint(str);
    }
}