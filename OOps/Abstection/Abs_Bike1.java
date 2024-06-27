package OOps.Abstection;

//Abstract class
abstract class Bike1 {

    // Abstract Methad -----> not body
    public abstract void start();

    public abstract void run();

}

class Honda1 extends Bike1 {

    @Override
    public void start() {
        System.out.println("Bike_..........................start");
    }

    public void run() {
        System.out.println("Bike......................runing");

    }

    public void selfkey() {
        System.out.println("Bike ..............self key");
    }

    public void stop() {
        System.out.println("Bike....................stop");

    }

}

public class Abs_Bike1 {

    public static void main(String args[]) {

        Bike1 bi = new Honda1();

        bi.start();
        bi.run();

        // not refrence variable
        Honda1 h1 = new Honda1();
        h1.selfkey();
        h1.stop();

    }

}