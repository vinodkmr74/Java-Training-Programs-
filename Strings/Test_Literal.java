package Strings;

public class Test_Literal {

    public static void main(String args[]) {

        // By using literal (String constent pool (heap) memory

        String str1 = "vinod";
        String str2 = "vinod";

        String str3 = "singh";
        String str4 = "kumar";

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

        // new keyword (Non-pool )

        String s1 = new String("php");
        String s2 = new String("java");
        String s3 = new String("java");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        // concat
        String s4 = new String("c++");
        s4.concat("c");
        System.out.println(s4.concat("c"));

        String s5 = new String("String").intern();
        System.out.println(s5);

    }

}
