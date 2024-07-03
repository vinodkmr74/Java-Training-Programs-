package Nested_class.Static_class;

class Myclass {
    static int id = 101;
    static String city = "noida";

    static class Inner {

        int age = 25;
        String Name = "vikash";

        void show() {

            System.out.println("id: " + id);
            System.out.println("city: " + city);
            System.out.println("age: " + age);
            System.out.println("name: " + Name);
        }

    }
}

public class static_inner_class {

    public static void main(String args[]) {

        Myclass.Inner inner = new Myclass.Inner();
        inner.show();

    }

}
