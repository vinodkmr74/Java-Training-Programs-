package Nested_class.Anonymous_class;

interface Laptop2

{

    void on();

    void off();

}

public class Anonymous {

    public static void main(String[] args) {

        Laptop2 laptop2 = new Laptop2() {

            @Override
            public void on() {
                System.out.println("laptop............on");

            }

            @Override
            public void off() {
                System.out.println("Laptop ...........off");
            }

        };
        laptop2.on();
        laptop2.off();

    }

}
