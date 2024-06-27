package OOps.Abstection.Interfaces1;

interface vehical {
    float PI_VALUSE = 3.14F;

    public abstract void start();

    // by defolt public absterct hota h
    void run();

    void stop();

}

interface vehical2 {
    float PI_VALUSE = 3.14f;

    public abstract void ApplyBrack();

    void Horn();
}

class Swifl {
    public void playMusic() {
        System.out.println("Swift play music.....");
    }

}

class Audi extends Swifl implements vehical, vehical2 {

    public void start() {

        System.out.println("Audi.................start");

    }

    public void run() {

        System.out.println("Audi..................run");

    }

    public void stop() {

        System.out.println("Audi.................stop");

    }

    public void ApplyBrack() {

        System.out.println("Audi................ApplyBrack();");

    }

    public void Horn() {

        System.out.println("Audi.....................Horn");

    }

}

public class Car3 {

    public static void main(String[] args) {

        vehical v5 = new Audi();
        v5.start();
        v5.run();
        v5.stop();
        System.out.println();

        vehical2 v6 = new Audi();
        v6.ApplyBrack();
        v6.Horn();

        System.out.println();
        Swifl s = new Swifl();
        s.playMusic();

        System.out.println();
        Audi a = new Audi();
        a.start();
        a.run();
        a.stop();
        a.ApplyBrack();
        a.Horn();
        s.playMusic();

        System.out.println(vehical.PI_VALUSE);

    }

}
