package Static;

public class V_static3 {

    static int n = 20; // static variable

    static void isDisply() { /// static methad
        System.out.println(n);
        return;
    }

    public static void main(String[] args) {

        V_static3.isDisply(); // not object direct call class thruw

    }

}
