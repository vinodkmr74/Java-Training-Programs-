package Association;

class Car5 {
    String bName;
    String color;
    float price;
    Engine engine;

    Car5(String bName, String color, float price, Engine engine) {

        this.bName = bName;
        this.color = color;
        this.price = price;
        this.engine = engine;

    }

    void carprint() {
        System.out.println("Brand name: " + bName);
        System.out.println("color: " + color);
        System.out.println("price: " + price);
        System.out.println("Engine hp: " + engine.hp);
        System.out.println("Engine lienar: " + engine.lienar);
        System.out.println("Engine calach: " + engine.calach);
        System.out.println("Engine Disbreak: " + engine.Disbreak);

    }

    void Start() {
        System.out.println(" Engine..............start");
    }
}

class Engine {
    float hp;
    String lienar;
    int calach;
    int Disbreak;

    Engine(float hp, String lienar, int calach, int Disbreak) {

        this.hp = hp;
        this.lienar = lienar;
        this.calach = calach;
        this.Disbreak = Disbreak;
    }

}

public class Associations {

    public static void main(String args[]) {

        Engine en = new Engine(150, "strong_85", 1, 2);

        Car5 car = new Car5("maruti", "white", 10000.00f, en);

        car.Start();
        car.carprint();

    }
}