package Nested_class;

import Nested_class.Nested.Inner;

class Outer {
    int a = 50;
    String name = "Rahul";

    void Fun1() {
        System.out.println(a);
        System.out.println(name);
    }

    class Inner2 {
        String singh = "Singh";

        void show() {
            System.out.println(singh);
        }
    }

    class Inner3 {
        String singh = "vinod Singh";

        void show() {
            System.out.println(singh);
        }
    }

    void Fun2() {

        Inner2 inner2 = new Inner2();
        inner2.show();

        Inner3 inner3 = new Inner3();
        inner3.show();
    }
}

public class Nasted2 {

    public static void main(String args[]) {

        Outer outer = new Outer();
        outer.Fun1();
        outer.Fun2();

    }

}
