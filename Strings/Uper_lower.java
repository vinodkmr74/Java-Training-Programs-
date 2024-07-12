package Strings;

import java.util.Scanner;

class Uplw {

    public void uperCase(String str) {

        System.out.println(str.toUpperCase());

    }

    public void lowerCase(String str) {

        System.out.println(str.toLowerCase());

    }

}

public class Uper_lower {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER a String");
        String str = sc.nextLine();
        Uplw obj = new Uplw();
        obj.uperCase(str);
        obj.lowerCase(str);

    }
}