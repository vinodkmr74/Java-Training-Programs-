package Nested_class.Wrapper_class;

public class Wrapper {

    public static void main(String[] args) {

        Integer b1 = 15;
        int b2 = 20;

        Integer b3 = b2; // Auto-boxing
        
        int b4 = b3; // Auto- unboxing

        System.out.println(b4);

    }
}