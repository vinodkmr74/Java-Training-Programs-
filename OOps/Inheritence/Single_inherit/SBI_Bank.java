package OOps.Inheritence.Single_inherit;

class Branch {

    String name;

    public void OfficeOnTime() {
        System.out.println("SBI.............OfficeOnTime");

    }

    public void OfficeLanchTime() {
        System.out.println("SBI.............OfficeLanchTime");

    }

    public void OfficeOffTime() {
        System.out.println("SBI.............OfficeOffTime");

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class SBI extends Branch

{

}

public class SBI_Bank {

    public static void main(String args[]) {

        Branch sbi = new Branch();

        sbi.setName("SBI_Bank");
        sbi.OfficeOnTime();
        sbi.OfficeLanchTime();
        sbi.OfficeOffTime();

        System.out.println("super class Data use.............");

        SBI sb = new SBI();

        sb.setName("SBI_Bank");
        sb.OfficeOnTime();
        sb.OfficeLanchTime();
        sb.OfficeOffTime();

    }
}
