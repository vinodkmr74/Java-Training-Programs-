package Static.Non_static;

public class Var {

    // instence variable
    String name;
    String Address;
    int roll;
    int id;

    void print() {
        System.out.println(name);
        System.out.println(Address);
        System.out.println(roll);
        System.out.println(id);
    }

    public static void main(String args[]) {
        Var non; /// refrence var
        non = new Var(); // objrct

        non.name = "vinod singh";
        non.Address = "Sitamarhi";
        non.roll = 150;
        non.id = 1200;
        non.print();

    }

}
