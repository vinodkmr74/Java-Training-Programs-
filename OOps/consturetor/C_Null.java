package consturetor;

class nullValuse {

    private String name;
    private String Address;
    private int id;

    nullValuse() {

    }

    void print() {

        System.out.println("name: " + name);
        System.out.println("Address: " + Address);
        System.out.println("id: " + id);

    }
}

public class C_Null {

    public static void main(String args[]) {

        nullValuse nul = new nullValuse();
        nul.print();

    }

}
