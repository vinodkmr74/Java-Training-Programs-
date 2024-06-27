package OOps.Inheritence.Single_inherit;

class AirCond {

    private String name;

    // Consturcter

    AirCond(String name) {
        this.name = name;

    }

    public void On() {
        System.out.println("AirConditioner.................on");

    }

    public void off() {
        System.out.println("Airconditioner.......................off");
    }

    public void calling() {
        System.out.println("AirConditioner................calling");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

class DaikinAc extends AirCond {

    // Constucter
    public DaikinAc(String name) {
        super(name);

        System.out.println("class Daikin.Class Daikin");
    }

    public void show() {
        System.out.println(getName());
    }

}

public class Ac_constuctor_call {

    public static void main(String[] args) {

        DaikinAc ac = new DaikinAc("Accc....");

        ac.setName("Daikin Ac");
        ac.On();
        ac.off();
        ac.calling();
        ac.show();

    }

}
