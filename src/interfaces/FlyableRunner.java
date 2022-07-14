package interfaces;


interface Flyable{

    void fly();

}
class Bird implements Flyable{

    @Override
    public void fly() {
        System.out.println("with the wings");
    }
}

class Aeroplane implements Flyable{

    @Override
    public void fly() {
        System.out.println("with fuel");
    }
}
public class FlyableRunner {
    public static void main(String[] args) {
        Flyable[] flyingObjects = {new Bird(), new Aeroplane()};
        for (Flyable object : flyingObjects) {
            object.fly();
        }

    }
}
