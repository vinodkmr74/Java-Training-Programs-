package OOps.Overloading;

class Space {
    public int sum() {
        return 10 + 20;

    }

    public int sum(int a) {
        return 10 + a;

    }

    public int sum(int a, int b) {
        return a + b;
    }

    public float sum(int a, float b) {
        return a + b;
    }

    public float sum(float a, int b)

    {
        return a + b;
    }

    public float sum(float a, float b) {
        return a + b;
    }

}

public class Fun_overloading {

    public static void main(String[] args) {
        Space sp = new Space();
        System.out.println(sp.sum(2.20f, 20));

    }

}
