package OOps.Inheritence.Super_kybord;

class A {

    A() {

        System.out.println("A is.......");
        System.out.println("A is suppper class.............");
    }
}

class Child extends A {
    Child() {

        // Defolt consturcter me supper Atomatic call hota h
        super();
        System.out.println("b is supper class...............");
    }

}

class Dfcon {

    public static void main(String[] args) {

        Child obj = new Child();

    }
}
