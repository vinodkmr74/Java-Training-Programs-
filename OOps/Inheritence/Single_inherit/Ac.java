package OOps.Inheritence.Single_inherit;

class AirConditioner {

    private String name;

    public void on() {

        System.out.println("AirConditioner.......................On");

    }

    public void off() {

        System.out.println("AirConditioner.....................Off");

    }

    public void calling() {

        System.out.println("AirConditioner ........................calling");
    }

    public void setName(String name) {

        this.name = name;

    }

    public String getName() {

        return name;
    }
}

class Daikin extends AirConditioner {

}

public class Ac {

    public static void main(String[] args) {

        AirConditioner ac = new AirConditioner();

        ac.setName("Ac");
        ac.on();
        ac.off();
        ac.calling();

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        Daikin da = new Daikin();

        ac.setName("Ac");
        ac.on();
        ac.off();
        ac.calling();

    }

}
