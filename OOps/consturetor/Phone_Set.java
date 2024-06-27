package OOps.consturetor;

class Smphone {

    String color;
    String brandName;
    int model;

    // constecter
    public Smphone() {

        color = "Read";
        brandName = "Sumsung";
        model = 123;
    }

    // pramiter constecter
    public Smphone(String color, String brandName, int model)

    {
        this.color = color;
        this.brandName = brandName;
        this.model = model;

    }

    public void setColor(String color) {

        this.color = color;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public void print() {
        System.out.println("color: " + color);
        System.out.println("brandName: " + brandName);
        System.out.println("model: " + model);

    }
}

public class Phone_Set {

    public static void main(String[] args) {

        Smphone phone = new Smphone();
        phone.print();

        System.out.println(" ");

        // update

        Smphone iphone = new Smphone("white", "iphone", 12);
        iphone.print();

        System.out.println(" ");

        // update

        Smphone nokia = new Smphone("black", "Nokia", 12);
        nokia.print();

        System.out.println(" ");

        nokia.setModel(1200);
        nokia.print();

        System.out.println(" ");

        Smphone Opp = new Smphone();
        Opp.print();

        System.out.println(" ");

        Opp.setColor("yellow");
        Opp.print();

    }

}
