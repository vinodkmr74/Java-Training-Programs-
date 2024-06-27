package OOps.Inheritence.Single_inherit;

class Airac {
    String name;

    // pramiter constecter
    public Airac(String name) {
        this.name = name;
    }

    // d_F consturctor
    public Airac() {
        name = "Daikin";
    }

    public void on() {
        System.out.println("AirConditioner.............on");

    }

    public void off() {
        System.out.println("AirConditioner...........off");

    }

    public void calling() {
        System.out.println("AirCondition...............calling");
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getname() {
        return name;

    }

}

class Airacc extends Airac {

    int model;

    public Airacc(String name, int model) {

        super(name);
        this.model = model;

    }

    public Airacc() {

        super();
        model = 2023;
    }

    public void show()

    {
        System.out.println(getname());
        System.out.println(model);

    }

}

public class Inherit {
    public static void main(String args[]) {

        Airacc ac = new Airacc();
        ac.on();
        ac.off();
        ac.calling();
        ac.show();

    }

}
