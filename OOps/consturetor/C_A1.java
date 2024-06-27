package consturetor;

class Ab {
    private String name;
    private String Address;
    private int id;

    Ab() {

        name = "vinod";
        Address = "Noida";
        id = 123;

    }

    void print() {

        System.out.println("name: " + name);
        System.out.println("Address: " + Address);
        System.out.println("id:" + id);

    }
}

public class C_A1 {

    public static void main(String args[]) {

        Ab def = new Ab();
        def.print();

    }

}
