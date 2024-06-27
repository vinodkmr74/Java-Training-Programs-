package OOps.Inheritence.Super_kybord;

class AB {
    AB(String str) {
        System.out.println("AB");
        System.out.println(str);

    }

}

class Abc extends AB {

    Abc() {

        super("vinod");
        System.out.println("Abc");
    }
}

public class Pra_const {

    public static void main(String args[]) {

        Abc obj = new Abc();
    }

}