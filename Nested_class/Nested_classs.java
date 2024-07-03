package Nested_class;

class Nested {

    int a = 10;
    String str = "vinod";

    void show() {
        System.out.println(a);
        System.out.println(str);
    }

    class Inner {
        int b = 12;
        String name = "singh";

        void inform() {
            System.out.println("IT information");
        }

    }

    void Display() {

        Inner inn = new Inner();
        inn.inform();
    }

}

public class Nested_classs {

    public static void main(String args[]) {

        Nested nested = new Nested();

        nested.show();
        nested.Display();

    }

}