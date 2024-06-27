package Static;

public class Ref__var {

    public static void main(String[] args) {

        Vehical.name = "Sitamarhi";

        Vehical obj; // refrence variable

        obj = new Vehical(); // object

        obj.Name = "vehical_Car";
        obj.color = "red";
        obj.sp = 20;
        obj.price = 202020;
        obj.print();

        System.out.println("..........................................");

        // Vehical vv = new Vehical();
        // vv.print();

    }

}
