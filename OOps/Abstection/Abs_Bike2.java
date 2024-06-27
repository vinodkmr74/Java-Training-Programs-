package OOps.Abstection;

//Abstract class
abstract class Bike2 {

    // Abstract Methad -----> not body
    public abstract void start();

    public abstract void run();

}

class Honda2 extends Bike2 {

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

public class Abs_Bike2 {

    public static void main(String args[]) {

        Honda2 bike = new Honda2();

        bike.start();
        bike.run();
        bike.selfkey();
        bike.stop();

    }

}
