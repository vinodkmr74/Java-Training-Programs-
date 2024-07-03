package Nested_class.LocalClass;

class Local2 {

    final int id = 102;
    static String name = "vinod";
    private String Address = "Noida";

    void localfun() {
        class Innerlocal {
            String city = "noida";

            void print() {
                System.out.println(id);
                System.out.println(name);
                System.out.println(city);
                System.out.println(Address);
            }
        }

        Innerlocal local = new Innerlocal();
        local.print();
    }

}

public class Local_class2 {

    public static void main(String args[]) {

        Local2 lll = new Local2();
        lll.localfun();

    }

}