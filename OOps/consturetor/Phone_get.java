package OOps.consturetor;

class Phone {

    String brandName;
    String color;
    String model;
    int price;

    public Phone() {

        brandName = "Oppo";
        color = "read";
        model = "iphone1001";
        price = 49000;
    }

    public Phone(String brandName, String color, String model, int price) {

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

public class Phone_get {

    public static void main(String[] args) {

        Phone Oppo = new Phone();
        Oppo.show();

        System.out.println();

        Oppo.setbrandName("iphone");
        Oppo.show();

        // data get

        System.out.println();
        System.out.println("Get propety brandName: " + Oppo.getBrandName());

        System.out.println();
        System.out.println("Get propety color: " + Oppo.getcolor());

        System.out.println();
        System.out.println("Get propety model: " + Oppo.grtmodel());

        System.out.println();
        System.out.println("Get propety price: " + Oppo.getprice());

    }

}
