package IF.AND_OR;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enret marks");
        int marks = sc.nextInt();
        if (marks >= 90 && marks <= 100) {
            System.out.println("A gread: " + marks);
        } else if (marks >= 70 && marks <= 89) {
            System.out.println("B gread: " + marks);
        } else if (marks >= 60 && marks <= 69) {
            System.out.println("first div: " + marks);

        } else if (marks >= 33 && marks <= 59) {
            System.out.println("just pass: " + marks);
        } else if (marks >= 0 && marks <= 32) {
            System.out.println("fall:" + marks);
        } else {
            System.out.println("Invalid marks");
        }

    }

}
