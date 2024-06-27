package OOps.Encapsulation;

class AirCondition {
    private String name;

    public void on() {
        System.out.println("Aircondition  on..........");
    }

    public void off() {
        System.out.println("Air condition off..........");
    }

    public void cooling() {
        System.out.println(" colling start............");
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getname() {
        return name;
    }

    public void print() {
        System.out.println("name: " + name);
    }
}

public class Encap {

    public static void main(String args[]) {

        AirCondition air = new AirCondition();
        air.on();
        air.off();
        air.cooling();
        air.setName("Air_Ac");
        air.print();

    }

}
