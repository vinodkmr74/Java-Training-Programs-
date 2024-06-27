package OOps.Inheritence.Super_kybord;

class first {

    void ab() {

        System.out.println("first");
    }

    class Secand extends first {
        void ab() {

            System.out.println("secand");

            super.ab();
        }
    }
}

public class Methed {
    public static void main(String[] args) {

        first ff = new first();
        ff.ab();

    }
}
