package Nested_class.Anonymous_class;

abstract class Laptop {

    String name;

    Laptop(String name) {

        this.name = name;
    }

    public abstract void on();

    public abstract void off();

}

public class Anonymous_classs {

    public static void main(String[] args) {

        Laptop laptop = new Laptop("dell_i5") {
            @Override
            public void on() {
                System.out.println("Laptop .................on");

            }

            @Override
            public void off() {
                System.out.println("Laptop........................off");

            }

        };

        laptop.on();
        laptop.off();

    }

}
