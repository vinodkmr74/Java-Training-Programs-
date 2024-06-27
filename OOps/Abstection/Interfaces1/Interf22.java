package OOps.Abstection.Interfaces1;

interface Car {
    public abstract void start();

    public abstract void run();
}

interface Car2 {
    public abstract void music();

    public abstract void stop();
}

class Engeen implements Car, Car2 {

    @Override
    public void start() {

        System.out.println("car...............start");

    }

    @Override
    public void run() {

        System.out.println("car...................run");

    }

    @Override
    public void music() {

        System.out.println("car...........................music");

    }

    @Override
    public void stop() {

        System.out.println("car...........................stop()");

    }
}

public class Interf22 {

    public static void main(String[] args) {

        Car car = new Engeen();

        car.start();
        car.run();

        System.out.println();
        Car2 car2 = new Engeen();
        car2.music();
        car2.stop();

        System.out.println();
        Engeen engeen = new Engeen();
        engeen.start();
        engeen.run();
        engeen.music();
        engeen.stop();

    }

}
