
class A {

    A name() {
        System.out.println("Name");

        return this;
    }

}

class B extends A {
    B Address() {
        System.out.println("Noida");
        return this;
    }
}

public class Tests1 {

    public static void main(String[] args) {

        B b = new B();
        b.Address();

    }

}
