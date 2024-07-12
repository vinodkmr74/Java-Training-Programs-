package Strings;

class Abc {

    int a = 10;
    int b = 4;

    void start(int a, int b) {

        // this.a = a;
        // this.b = b;
        int c = a + b;

        System.out.println(c);

    }

    void end(int c) {

    }
}

public class Case {

    public static void main(String[] args) {

        Abc abc = new Abc();
        abc.start(10, 20);

    }
}