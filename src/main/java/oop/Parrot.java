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

    public boolean isExpensive(Breed breed){
        if (breed.getBreedName().equals("Ara")){
            return true;
        }else {
            return false;
        }
    }

    //method overload
    public boolean isExpensive(){
        if (super.getBreed().getBreedName().equals("Ara")){
            return true;
        }else {
            return false;
        }
    }


}
