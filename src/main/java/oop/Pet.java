package oop;

public class Pet implements PetActions{
    private boolean hasTail;
    private String name;
    private int age;
    private Breed breed; //Composition
    private Address address; //Aggregation

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        }else {
            System.out.println("Invalid data!");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0){
            this.age = age;
        }else{
            System.out.println("Invalid data!");
        }
    }

    public Breed getBreed() {
        return breed;
    }

    public Pet(boolean hasTail, String name, int age, Breed breed, Address address) {
        setHasTail(hasTail);
        setName(name);
        setAge(age);
        setBreed(breed);
        setAddress(address);
    }

    public void setBreed(Breed breed) {
        if (!breed.equals(null)){
            this.breed = breed;
        }else{
            System.out.println("Invalid data!");
        }
    }

    public void printData(){
        System.out.printf("This dog` name is: %s.%nThis dog`s age: %d.%nThis dog`s breed is: %s.%n", name, age, breed);
        if (hasTail){
            System.out.println("This dog has tail.");
        }else {
            System.out.println("this dog does not have tail.");
        }
    }


    @Override //method override
    public void run() {
        System.out.println(name + " is running...");
    }

    @Override
    public void jump() {
        System.out.println(name + " is jumping...");
    }


}
