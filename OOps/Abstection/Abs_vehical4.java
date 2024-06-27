package OOps.Abstection;

abstract class vehical4 {
    public abstract void start();

    public abstract void run();

    public void Rback() {
        System.out.println("car...................Rback");

    }

    public vehical4() {

        String chName = "Scarpeeo";

        System.out.println("car.................light" + chName);

    }

    public vehical4(String color) {

        System.out.println("car....................: " + color);

    }
}

class Nano4 extends vehical4 {

    public Nano4(String color) {

        System.out.println("car....................: " + color);

    }

    @Override
    public void start() {
        System.out.println("Nano............Start");

    }

    @Override
    public void run() {
        System.out.println("Nano............run");

    }

    public void Rback() {
        System.out.println("car...................Rback");

    }

    public void Divece() {
        System.out.println("FM Radio............music");

    }
}

class Audi4 extends vehical4 {

    public void start() {
        System.out.println("Nano............Start");

    }

    public void run() {
        System.out.println("Nano............run");

    }

    public void Rback() {
        System.out.println("car...................Rback");

    }

    public void Divece2() {
        System.out.println("FM Radio, video, Gps............music");

    }

}

public class Abs_vehical4 {

    public static void main(String[] args) {

        vehical4 ve = new Nano4("yellow");
        ve.start();
        ve.run();
        ve.Rback();
        // ve.vehical4();

        System.out.println();
        Nano4 nn = new Nano4("red");
        ve.start();
        ve.run();
        ve.Rback();
        nn.Divece();

        System.out.println();
        Audi4 au = new Audi4();

        ve.start();
        ve.run();
        ve.Rback();
        au.Divece2();

    }

}
