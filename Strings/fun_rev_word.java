
class Wrev {
    void revWord(String str, String arr[]) {
        for (int i = arr.length - 1; i >= 0; i--) {

            System.out.print(arr[i] + " ");

        }
    }
}

public class fun_rev_word {

    public static void main(String args[]) {

        String str = "i anm vinod singh";
        String arr[] = str.split(" ");

        Wrev ob = new Wrev();
        ob.revWord(str, arr);

    }
}
