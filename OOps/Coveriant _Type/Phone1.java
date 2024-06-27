class Realme {
    String brandName;
    String color;
    String model;

    Realme phone1() {
        brandName = "Realme";
        color = "yellow";
        model = "rel1020";
        return this;

    }

    Realme phone2(String brandName, String color, String model) {
        this.brandName = brandName;
        this.color = color;
        this.model = model;

        return this;
    }

    Realme phonePrint() {

        System.out.println(brandName);
        System.out.println(color);
        System.out.println(model);

        return this;

    }
}

class Opp extends Realme {

    // Covriant return type

    @Override
    Opp phone1() {

        super.phone1();
        super.phone2(brandName, color, model);
        super.phonePrint();

        brandName = "Realme";
        color = "Red";
        model = "rel1020";

        return this;

    }

    @Override

    Opp phone2(String brandName, String color, String model) {

        this.brandName = brandName;
        this.color = color;
        this.model = model;
        return this;
    }

    @Override
    Opp phonePrint() {

        System.out.println(brandName);
        System.out.println(color);
        System.out.println(model);

        return this;

    }
}

public class Phone1 {

    public static void main(String args[]) {

        // Realme realme = new Opp();
        // realme.phone1();
        // realme.phone2("realme", "white", "rr1020");
        // realme.phonePrint();

        System.out.println();

        Opp phone = new Opp();
        phone.phone1();
        phone.phone2("Opp", "blue", "Opp1020");
        phone.phonePrint();

    }

}
