package data.types;

public class Dog {
    private String name;
    private byte age;
    //this is a static variable
    private static String breed;
    //this is const
    public final static String TAIL = "short";

    public String getBreed(){
        return breed;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public void barf(){
        //local variable
        String dogAction = "barking...";

        System.out.println("The dog named: " + name + " and age: " +  " " + dogAction);
    }
}
