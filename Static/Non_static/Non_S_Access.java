/**
 * Non_S_Access
 */
public class Non_S_Access {

    // instance v

    String name = "singh";
    String Address = "Noida";

    // static va

    static int id = 12;
    static int roll = 20;

    void print_Non_static() {

        // Non-static -> all Access

        System.out.println("Name: " + name);
        System.out.println("address: " + Address);
        System.out.println("id: " + id);
        System.out.println("roll: " + roll);

    }

    static void printM1() {

        // non-static variable -> not access
        // System.out.println("Name: " + name);
        // System.out.println("address: " + Address);

        // static variable -> only static variable
        System.out.println("id: " + id);
        System.out.println("roll: " + roll);

    }

    public static void main(String[] args) {
        Non_S_Access non = new Non_S_Access();

        non.print_Non_static();

        System.out.println("..................................................");

        Non_S_Access.printM1();

    }

}