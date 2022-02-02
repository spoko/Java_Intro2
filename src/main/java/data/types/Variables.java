package data.types;

public class Variables {
    public static void main(String[] args) {
        //all variable here are local
        //some of the primitive types
        byte age = 120;
        char someRandomChar = 'd';
        String somestring = "some string";
        String someString = "string some";

        //Referent types
        String someRandomString = "Random String";
        Dog myDog = new Dog();
        myDog.setName("Morti");
        myDog.setAge((byte) 3);
        myDog.setBreed("French Bulldog");

        System.out.println("My dog name is: " + myDog.getName());
        System.out.println("My dog age is: " + myDog.getAge());

        myDog.setAge((byte) 2);
        System.out.println("My dog age is: " + myDog.getAge());

        Dog myDog2 = new Dog();
        myDog2.setName("Rexi");
        myDog2.setAge((byte) 5);
        myDog2.setBreed("German Shepard");

        System.out.println("first dog breed is: " + myDog.getBreed());
        System.out.println("second dog breed is: " + myDog2.getBreed());

        myDog.barf();

    }
}
