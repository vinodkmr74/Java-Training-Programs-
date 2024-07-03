package Nested_class.Static_class;

class Outerclass {
    int a = 30;
    static String name = "pancham";

    static class innerclass {

        String kumar = "kumar";
        static int b = 15;

        void show2() {

            System.out.println("b: " + b);
            System.out.println("Name: " + name);
            System.out.println("kumar: " + kumar);

        }

    }
}

public class Static_classs {

    public static void main(String args[]) {

        Outerclass.innerclass object = new Outerclass.innerclass();
        object.show2();

    }

}