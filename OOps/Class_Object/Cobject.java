package OOps.Class_Object;

class Pen {

    // intence variable

    String name;
    String color;
    int prise;
    String commpny;

    // intence mathed
    void write() {
        System.out.println("write code....hi!!!!!!!!!!!!!!!!!");
    }

    // intence mathed
    void print() {
        System.out.println(name);
        System.out.println(color);
        System.out.println(prise);
        System.out.println(commpny);

    }
}

public class Cobject {

    public static void main(String args[]) {

        Pen p = new Pen();
        p.name = "Linkar";
        p.color = "red";
        p.prise = 20;
        p.commpny = "abc";

        p.print();
        p.write();

    }

}