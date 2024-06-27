package OOps.Class_Object;

class Car {

    String name;
    String color;
    int door;
    int prise;

    void start() {

        System.out.println("start");

    }

    void run() {
        System.out.println("Rum");

    }

    void stop() {
        System.out.println("stop");

    }

    void print() {
        System.out.println("name: " + name);
        System.out.println("color: " + color);
        System.out.println("door: " + door);
        System.out.println("prise: " + prise);
    }

}

public class Object2 {

    public static void main(String[] args) {

        Car carob;
        carob = new Car();
        carob.name = "car12";
        carob.color = "black";
        carob.door = 5;
        carob.prise = 20000;

        carob.start();
        carob.run();

        carob.print();
        carob.stop();

    }

}
