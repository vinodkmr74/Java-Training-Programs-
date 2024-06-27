package OOps.Encapsulation;

class Pen {
    private String brandName;
    private int price;

    public void setPen(String brandName) {
        this.brandName = brandName;

    }

    public void setPen(int price) {
        this.price = price;
    }

    public String getPen() {

        return brandName;

    }

    public int getPen1() {

        return price;
    }

    public void show() {
        System.out.println("brandName:" + brandName);
        System.out.println("price: " + price);
    }

}

public class E_test {

    public static void main(String args[]) {

        Pen p = new Pen();

        p.setPen("linkpen");
        p.setPen(102);
        p.show();

        System.out.println("Get pen brandname: " + p.getPen());

        System.out.println("get pen price: " + p.getPen1());

    }

}