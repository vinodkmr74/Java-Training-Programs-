package OOps.consturetor;

class Laptop1 {

    String brandName;
    String color;
    String model;
    int price;

    public Laptop1() {

        brandName = "dell";
        color = "read";
        model = "dell12";
        price = 26000;
    }

    public Laptop1(String brandName, String color, String model, int price) {

        this.brandName = brandName;
        this.color = color;
        this.model = model;
        this.price = price;
    }

    public String getBrandName() {

        return brandName;

    }

    public String getcolor() {
        return color;

    }

    public String grtmodel() {

        return model;

    }

    public int getprice() {

        return price;

    }

    public void setbrandName(String brandName)

    {
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

public class Laptop_get {

    public static void main(String[] args) {

        Laptop1 dell = new Laptop1();
        dell.show();

        System.out.println();

        dell.setbrandName("Lenvo");
        dell.show();

        // data get

        System.out.println();
        System.out.println("Get propety brandName: " + dell.getBrandName());

        System.out.println();
        System.out.println("Get propety color: " + dell.getcolor());

        System.out.println();
        System.out.println("Get propety model: " + dell.grtmodel());

        System.out.println();
        System.out.println("Get propety price: " + dell.getprice());

    }

}
