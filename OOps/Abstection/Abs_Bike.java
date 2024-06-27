package OOps.Abstection;

//Abstract class
abstract class Bike {

    // Abstract Methad -----> not body
    public abstract void start();

    public abstract void run();

    public abstract void stop();

}

class Honda extends Bike {

    @Override
    public void start() {
        System.out.println("Bike_..........................start");
    }

    public void run() {
        System.out.println("Bike......................runing");

    }

    public void stop() {
        System.out.println("Bike....................stop");

    }

}

public class Abs_Bike {

    public static void main(String args[]) {

        Bike bi = new Honda();

        bi.start();
        bi.run();
        bi.stop();

    }

}