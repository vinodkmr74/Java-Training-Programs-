package Association.Aggregation;

class Address {
    String city;
    String contry;
    Student student;

    Address(String city, String contry, Student student) {
        this.city = city;
        this.contry = contry;
        this.student = student;
    }

    void Adprint() {
        System.out.println(city);
        System.out.println(contry);

        System.out.println(student.Sname);
        System.out.println(student.RollNum);
        System.out.println(student.Branch);
    }

}

class Student {
    String Sname;
    int RollNum;
    String Branch;

    Student(String Sname, int RollNum, String Branch)

    {
        this.Sname = Sname;
        this.RollNum = RollNum;
        this.Branch = Branch;
    }

}

public class Has_A {

    public static void main(String args[]) {

        Student st = new Student("vinod", 203, "mca");

        Address ad = new Address("noida ", "india", st);
        ad.Adprint();
    }
}