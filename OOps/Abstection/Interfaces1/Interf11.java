package OOps.Abstection.Interfaces1;

interface Interface {
    public abstract void Interfaces();

    public abstract void Interfaces1();

}

class Test22 implements Interface {

    public void Interfaces()

    {

        System.out.println("Interface test...................1");
    }

    public void Interfaces1()

    {
        System.out.println("Interface print................2");

    }

}

public class Interf11 {

    public static void main(String args[]) {

        Interface in = new Interf22();

        in.Interfaces();
        in.Interfaces1();
    }
}
