package consturetor;

class sphone {

    private String name;
    private String color;
    private int model;
    private int price;

    public sphone(String n, String c, int m, int p) {
        name = n;
        color = c;
        model = m;
        price = p;

    }

    public void print() {
        System.out.println("name: " + name);
        System.out.println("color" + color);
        System.out.println("model: " + model);
        System.out.println("price: " + price);
    }

}

public class Con_object {

    public static void main(String args[]) {

        sphone sp = new sphone("sumsong", "red", 506, 20203);
        sp.print();

        System.out.println("new line........................................");

        sphone sp2 = new sphone("nokia", "yellow", 456, 7895);
        sp2.print();

    }

}
