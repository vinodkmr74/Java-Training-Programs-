package Nested_class.LocalClass;

class Mylocal {
    int id = 102;
    String name = "Avinash";

    void Display() {
        class Local {

            int age = 30;
            String city = "Delhi";

            void print() {
                System.out.println("id: " + id);
                System.out.println("name: " + name);
                System.out.println("age: " + age);
                System.out.println("city: " + city);
            }
        }

        Local local = new Local();
        local.print();

    }
}

public class Local_class {

    public static void main(String args[]) {

        Mylocal mylocal = new Mylocal();
        mylocal.Display();

    }

}