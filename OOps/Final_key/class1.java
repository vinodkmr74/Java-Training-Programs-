package Final_key;

final class oness {
    void one1() {

        System.out.println("vinod");
    }
}
// we can not use class super class in impliment final keyword
// class two2 extends oness {
// @Override
// void one1() {

// System.out.println("kumar");

// }
// }

public class class1 {

    public static void main(String[] args) {

        // two2 tt = new two2();
        // tt.one1();

        oness on = new oness();
        on.one1();
    }

}
