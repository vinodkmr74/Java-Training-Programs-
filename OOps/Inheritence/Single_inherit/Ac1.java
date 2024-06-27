
class Colling {
    String name;

    public Colling(String name) {

        this.name = name;
    }

    public void on() {
        System.out.println("Ac..................On");

    }

    public void off() {
        System.out.println("Ac....................off");
    }

    public void colling() {
        System.out.println("Ac.......................colling");
    }

    public void setName(String name)

    {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Daikinss extends Colling {
    int model;

    public Daikinss(String name, int model) {

        super(name);
        this.model = model;
    }

    public void print() {
        System.out.println("Name: "+getName());
        System.out.println("model: "+model);
    }
}

class Voltas extends Daikinss {

    String color;

    public Voltas(String name, int moel, String color) {

        super(name, moel);
        this.color = color;
    }

    public void show()

    {
        System.out.println("color: "+color);
    }

}

public class Ac1 {

    public static void main(String args[]) {

        Voltas acc = new Voltas("Acc", 2030, "yellow");
        acc.on();
        acc.off();
        acc.colling();
        acc.print();
        acc.show();

    }
}