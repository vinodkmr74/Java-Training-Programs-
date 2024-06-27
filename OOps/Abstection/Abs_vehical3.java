package OOps.Abstection;

abstract class vehical3 {
    public abstract void start();

    public abstract void run();

    public void Rback() {
        System.out.println("car...................Rback");

    }
}

class Nano3 extends vehical3 {

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

class Audi3 extends vehical3 {

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

public class Abs_vehical3 {

    public static void main(String[] args) {

        vehical3 ve = new Nano3();
        ve.start();
        ve.run();
        ve.Rback();

        System.out.println();
        Nano3 nn = new Nano3();
        ve.start();
        ve.run();
        ve.Rback();
        nn.Divece();

        System.out.println();
        Audi3 au = new Audi3();

        ve.start();
        ve.run();
        ve.Rback();
        au.Divece2();

    }

}
