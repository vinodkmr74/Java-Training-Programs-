package Association;

class One {
    One() {

        System.out.println("one");
    }

}

// is-A Relationship--->>(extends -->(is-A))

// or one [Is-A] two

class Two extends One {
    Two() {
        System.out.println("Tow");
    }
}

public class Is_A_Rela_Inhetence {

    public static void main(String args[]) {

        Two isA = new Two();
    }
}