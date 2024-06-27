package consturetor;

class Myclass {

    Myclass() {

        System.out.println("Atomaticlly call");

    }
}

public class Atomaticlly {

    public static void main(String args[]) {

        Myclass my = new Myclass();   //--->  Myclass();  Atomaticaly call

    }

}
