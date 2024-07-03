
class Singlenton2 {

    static Singlenton2 object2 = new Singlenton2();

    private Singlenton2() {

    }

    public static Singlenton2 getInstence() {

        return object2;

    }
}

public class Testsinglenton2 {

    public static void main(String[] args) {

        Singlenton2 object = Singlenton2.getInstence();

        System.out.println(object.toString());

        // Singlenton2 object2 = Singlenton2.getInstence();

        // System.out.println(object2.toString());

    }

}