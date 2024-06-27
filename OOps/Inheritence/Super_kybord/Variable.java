package OOps.Inheritence.Super_kybord;

class A {
    int a = 400;

}

class B extends A {
    int a = 500;

}

class C extends B {

    int a = 600;

    void show() {
        System.out.println(super.a);
    }

}

public class Variable {

    public static void main(String args[]) {

        C c1 = new C();
        c1.show();

    }

}
