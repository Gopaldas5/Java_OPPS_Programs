package Inheritance;

public class MultilevelInheritanceA {
    void showA1(){
        System.out.println(" A class method ");
    }
}
class B1 extends MultilevelInheritanceA{
    void showB1(){
        System.out.println(" B class method");
    }
}
class C1 extends B1{
    void showC1(){
        System.out.println(" C class method ");
    }

    public static void main(String[] args) {
        System.out.println(" Multilevel Inheritance ----->");
        MultilevelInheritanceA objA = new MultilevelInheritanceA();
        objA.showA1();
        System.out.println("------------------------------------");

        B1 objB = new B1();
        objB.showA1();
        objB.showB1();
        System.out.println("--------------------------------------");

        C1 objC = new C1();
        objC.showA1();
        objC.showB1();
        objC.showC1();
    }
}