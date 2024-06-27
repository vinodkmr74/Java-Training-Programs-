
public class Object_inslizetion {

    String name;
    String Address;
    int roll;
    int id;

    void print() {
        System.out.println("name: " + name);
        System.out.println("name: " + Address);
        System.out.println("name: " + roll);
        System.out.println("name: " + id);
    }

    public static void main(String[] args) {

        Object_inslizetion ob = new Object_inslizetion();

        // object inislizetion
        ob.name = "Girija";
        ob.Address = "Noida";
        ob.roll = 133;
        ob.id = 23;
        ob.print();

    }

}
