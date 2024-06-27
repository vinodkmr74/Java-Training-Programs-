package OOps.Inheritence.Super_kybord;

class supper {

    int a = 10;

}

class B extends supper {
    int a = 100;

    void print() {

        System.out.println(super.a);

    }
}

public class Inherit {

    public static void main(String args[]) {
        B s = new B();
        s.print();

    }

}
