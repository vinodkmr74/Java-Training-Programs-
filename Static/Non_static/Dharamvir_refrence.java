package Static.Non_static;

public class Dharamvir_refrence {

    public static void main(String[] args) {

        Dharamvir dh; // refrence variable
        dh = new Dharamvir(); /// object

        // refrence . valuse
        dh.Name = "Dharamvir";
        dh.Address = "Noida";
        dh.Depatment = "BCA";
        dh.id = 12;
        dh.roll = 1503;

        dh.printDharamvir();

    }

}
