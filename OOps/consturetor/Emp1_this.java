package OOps.consturetor;

class Emp1 {
    private String name;
    private int id;
    private String Address;
    private String Depatment;

    Emp1(String name, int id, String Address, String Depatment) {

        this.name = name;
        this.id = id;
        this.Address = Address;
        this.Depatment = Depatment;

    }

    void print() {
        System.out.println("Name: " + name);
        System.out.println("id: " + id);
        System.out.println("address: " + Address);
        System.out.println("Depatment: " + Depatment);

    }

}

public class Emp1_this {

    public static void main(String[] args) {

        Emp1 em = new Emp1("Shusant", 12, "Dellhi", "B - tech");

        em.print();
    }

}
