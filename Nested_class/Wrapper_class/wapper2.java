package Nested_class.Wrapper_class;

public class wapper2 {

    public static void main(String args[])

    {
        Integer a1 = new Integer(20);

        System.out.println(a1);

        int a2 = 50;

        Integer a3 = Integer.valueOf(a2); // Boxing

        System.out.println(a3);

        int a4 = a3.intValue(); // unBoxing

        System.out.println(a4);

    }
}