package consturetor;

class Employ5 {
    private String name;
    private String Address;
    private int id;
    private String compny;

    public Employ5(String n, String c, int m, String p) {
        name = n;
        Address = c;
        id = m;
        compny = p;

    }

    public void print() {
        System.out.println("name: " + name);
        System.out.println("Address" + Address);
        System.out.println("id: " + id);
        System.out.println("compny: " + compny);
    }

}

public class Employ {

    public static void main(String args[]) {

        Employ5 em = new Employ5("abcd", "red", 506, "dell");
        em.print();

        System.out.println("new line........................................");

        Employ5 em2 = new Employ5("xyz", "yellow", 456, "Dell");
        em2.print();

    }

}
