package Polymorphism;


abstract class Animal{
        abstract void bark();
    }

    class Dog  extends Animal{

        @Override
        public void bark() {
            System.out.println("Bow Bow");
        }
    }
    class Cat extends Animal{

        @Override
        public void bark() {
            System.out.println("Meow meow");

        }
    }
    class Lion extends Animal{

        @Override
        void bark() {
            System.out.println("Roar Roar");
        }
    }


    public class AnimalRunner {
        public static void main(String[] args) {
            Animal[] animals = {new Cat(), new Dog(), new Lion()};
            for (Animal animal:animals){
                animal.bark();

            }
        }
}


