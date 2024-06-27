package Final_key;

class methed1 {

    final void phonenum() {

        System.out.println(9920856);
    }

    final void pin() {
        System.out.println("pin: " + 205060);
    }

}

class methed2 extends methed1 {

    @Override
    void phonenum() { // we con not Access or Override it is use to finle keyword

        System.out.println("mob: " + 9920856);
    }

    @Override
    void pin() { // we con not Access or Override it is use to finle keyword
        System.out.println("pin: " + 205060);
    }

}

public class Methed {

    public static void main(String[] args) {

        methed2 mm = new methed2();
        mm.phonenum();
        mm.pin();

    }

}
