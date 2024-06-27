package Static.Non_static;

public class Dharamvir_one {

    // instence variable
    String Name;
    String Address;
    String Depatment;
    int id;
    int roll;

    void printDharamvir() {
        System.out.println("Name: " + Name);
        System.out.println("Address: " + Address);
        System.out.println("Depatment: " + Depatment);
        System.out.println("id: " + id);
        System.out.println("roll: " + roll);

    }

    public static void main(String[] args) {

        Dharamvir dh; // refrence variable
        dh = new Dharamvir(); /// object

        // refrence . valuse
        dh.Name = "Dharamvir";
        dh.Address = "Noida";
        dh.Depatment = "B-tech";
        dh.id = 12;
        dh.roll = 1503;

        dh.printDharamvir();

    }

}
