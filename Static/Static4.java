package Static;

public class Static4 {

    int n = 10; // intance variable
    static int nn = 20; // static variable // class variable

    static void isShow() { // static methad
        System.out.println("nn: " + nn);
        return;
    }

    void isDisply() { /// non-static methad

        // static intance variable and intance variable con be use in java
        System.out.println("n: " + n + " " + nn);
        return;
    }

    public static void main(String[] args) {

        isShow(); // not object
        Static4 ss = new Static4(); // class object
        ss.isDisply();

    }
}