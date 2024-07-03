package Nested_class.Static_class;

class Mystatic {
    int a = 10;
    String name = "vinod";

    void show() {
        class Non_static_class {
            int b = 13;

            void display() {
                System.out.println(a);
                System.out.println(b);
                System.out.println(name);

            }
        }
        Non_static_class non = new Non_static_class();
        non.display();
    }
}

public class Non_static {

    public static void main(String args[]) {

        Mystatic sss = new Mystatic();
        sss.show();

    }
}
