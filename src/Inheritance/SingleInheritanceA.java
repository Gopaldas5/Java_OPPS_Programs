package Inheritance;

public class SingleInheritanceA {
    void showA(){
        System.out.println("A class method");
    }
}
class B extends SingleInheritanceA {
    void showB() {
        System.out.println("B class method");
    }

    public static void main(String[] args) {
        System.out.println("Single level Inheritance ---->");
        SingleInheritanceA obj1 = new SingleInheritanceA();
        obj1.showA();
        System.out.println("-----------------------------------");
        B obj2 = new B();
        obj2.showB();
        obj2.showA();
    }
}