package Inheritance;

public class HierarchicalInheritanceA {
    void showA2(){
        System.out.println(" A class method");
    }
}
class B2 extends HierarchicalInheritanceA{
    void showB2(){
        System.out.println(" B class method");
    }
}
class C2 extends HierarchicalInheritanceA {
    void showC2() {
        System.out.println(" C class method ");
    }

    public static void main(String[] args) {
        System.out.println(" Hierarchical Inheritance ----> ");
        HierarchicalInheritanceA objA2 = new HierarchicalInheritanceA();
        objA2.showA2();
        System.out.println("-----------------------------------");

        B2 objB2 = new B2();
        objB2.showA2();
        objB2.showB2();
        System.out.println("------------------------------------");

        C2 objC2 = new C2();
        objC2.showA2();
        objC2.showC2();

    }
}
