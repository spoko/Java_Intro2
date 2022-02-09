package oop;

public class Parrot extends Pet{

    public Parrot(boolean hasTail, String name, int age, Breed breed, Address address) {
        super(hasTail, name, age, breed, address);
    }

    @Override
    public void run() {
        System.out.println(super.getName() + " is flying...");
    }

//    public void talk(){
//        System.out.println("I can talks");
//    }
}
