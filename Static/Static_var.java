package Static;

public class Static_var {

    // class variable
    static String Name;
    static String Address;
    static int id;
    static int roll;

    static void print() {
        System.out.println(Name);
        System.out.println(Address);
        System.out.println(id);
        System.out.println(roll);
    }

    public static void main(String args[]) {

        // refrence variable

        Static_var.Name = "vinod kumar";
        Static_var.Address = "Noida";
        Static_var.id = 123;
        Static_var.roll = 0012;

        Static_var.print();

    }
}