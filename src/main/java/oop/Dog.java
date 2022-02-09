package oop;

public class Dog extends Pet{

    public Dog(boolean hasTail, String name, int age, Breed breed, Address address) { //method overloading
        super(hasTail, name, age, breed, address);
    }
    public Dog(){
        super(false, "", 0, new Breed(""), null);//method overloading
    }

    public void barf(){
        System.out.println("Bau Bau Bau");
    }

}
