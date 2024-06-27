package consturetor;

class AtoCall {

    String name;
    String Address;

    AtoCall() {
        name = "lakshman";
        Address = "Noida";

        System.out.println("name:" + name);
        System.out.println("Address: " + Address);

    }
}

public class Atomatically1 {

    public static void main(String[] args) {

        AtoCall call = new AtoCall();

    }

}
