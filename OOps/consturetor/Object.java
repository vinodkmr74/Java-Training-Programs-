package consturetor;

class Smartphone {

    private String BrandName;
    private String color;
    private int model;

    void setter(String s, String c, int a) {

        BrandName = s;
        color = c;
        model = a;

    }

    void print() {
        System.out.println("BrandName: " + BrandName);
        System.out.println("color: " + color);
        System.out.println("model: " + model);
    }
}

public class Object {

    public static void main(String[] args)

    {

        Smartphone smp = new Smartphone();
        smp.setter("Nokia", "yellow", 1200);
        smp.print();

        System.out.println("new line..........................");

        Smartphone ph = new Smartphone();
        ph.setter("samsung", "Black", 1500);
        ph.print();
    }

}
