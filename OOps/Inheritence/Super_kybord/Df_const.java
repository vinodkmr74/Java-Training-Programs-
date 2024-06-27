package OOps.Inheritence.Super_kybord;

import OOps.Inheritence.Super_kybord.Supper2.child;

class Supper2 {
    Supper2() {
        System.out.println("Supper class consturctor");
    }

    class child extends Supper2 {

        child() {
            super();
            System.out.println("child class consturctor");
        }
    }
}

public class Df_const {

    public static void main(String args[]) {

        child bbb = new child();

    }
}
