package Static;

public class Vehical {

    // intence variable

    String Name;
    String color;
    int sp;
    int price;

    // class variable
    static String name;

    void print() {
        System.out.println("nam: " + Name);
        System.out.println("color: " + color);
        System.out.println("speed: " + sp);
        System.out.println("price: " + price);
        System.out.println("Static_name: " + name);

    }

}