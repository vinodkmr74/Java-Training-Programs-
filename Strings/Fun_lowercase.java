package Strings;

class Lowercase {
    void printlower(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                int asci = str.charAt(i) + 32;
                char ch = (char) asci;
                System.out.print(ch);
            } else {
                System.out.print(str.charAt(i));
            }
        }
    }
}

public class Fun_lowercase {
    public static void main(String args[]) {
        String str = "Sitamarhi";
        Lowercase lowercase = new Lowercase();
        lowercase.printlower(str);

    }

}
