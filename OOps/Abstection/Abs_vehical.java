package OOps.Abstection;

abstract class vehical2 {
    public abstract void start();

    public abstract void run();
}

class Nano2 extends vehical2 {

    @Override
    public void start() {
        System.out.println("Nano............Start");

    }

    @Override
    public void run() {
        System.out.println("Nano............run");

    }

    public void Divece() {
        System.out.println("FM Radio............music");

    }
}

class Audi2 extends vehical2 {

    public void start() {
        System.out.println("Nano............Start");

    }

    public void run() {
        System.out.println("Nano............run");

    }

    public void Divece2() {
        System.out.println("FM Radio, video, Gps............music");

    }

}

public class Abs_vehical {

    public static void main(String[] args) {

        vehical2 ve = new Nano2();
        ve.start();
        ve.run();

        System.out.println();
        Nano2 nn = new Nano2();
        nn.Divece();

        System.out.println();
        Audi2 au = new Audi2();
        au.Divece2();

    }

}
