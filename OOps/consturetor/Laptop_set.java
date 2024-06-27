package OOps.consturetor;

class Laptop {

    String brandName;
    String color;
    String model;
    int price;

    // consturecter

    public Laptop() {

        brandName = "Dell";
        color = "blue";
        model = "10_dell";
        price = 30000;

    }

    /// pramiter consturecter

    public Laptop(String brandName, String color, String model, int price) {

        this.brandName = brandName;
        this.color = color;
        this.model = model;
        this.price = price;
    }

    public void setbrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setcolor(String color) {

        this.color = color;

    }

    public void setmodel(String model) {

        this.model = model;
    }

    public void setprice(int price) {

        this.price = price;

    }

    public void show() {
        System.out.println("brandName: " + brandName);
        System.out.println("color: " + color);
        System.out.println("model: " + model);
        System.out.println("price: " + price);

    }
}

public class Laptop_set {

    public static void main(String[] args) {

        Laptop dell = new Laptop();
        dell.show();

        System.out.println(" ");

        // update

        Laptop hp = new Laptop("hp", "black", "hp40", 50000);
        hp.show();
        System.out.println();

        // update set data

        hp.setbrandName("Dell");
        hp.show();
        System.out.println(" ");

        Laptop Lenvo = new Laptop();
        Lenvo.show();
        System.out.println();

        Lenvo.setcolor("yellow");
        Lenvo.show();

        Laptop Ascer = new Laptop();
        Ascer.show();
        System.out.println();

        Ascer.setmodel("hp90");
        Ascer.show();

        System.out.println();

        Laptop abc = new Laptop();
        abc.show();
        
        System.out.println();
        abc.setprice(250000);
        abc.show();
    }

}
