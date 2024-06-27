package OOps.Abstection.Interfaces1;

interface Student {
    public abstract void Name();
}

interface Student2 extends Student {
    public abstract void Rollnum();

}

interface Student3 extends Student2 {
    public abstract void Address();
}

class Data implements Student3

{
    public void Name() {
        System.out.println("pancham singh");
    }

    public void Rollnum() {
        System.out.println("123");

    }

    public void Address() {
        System.out.println("noida");
    }
}

public class Studentdata {

    public static void main(String[] args) {

        Data data = new Data();
        data.Name();
        data.Rollnum();
        data.Address();

    }

}
