package oop;

public class Test {
    public static void main(String[] args) {
        Dog frenchie = new Dog(); //default constructor
        Address dogAddress = new Address();
        dogAddress.setCity("Sofia");
        dogAddress.setPostalCode(1000);
        dogAddress.setStreetName("Some street name");
        frenchie.printData();

        frenchie.setAge(2);
        Breed frBulldog = new Breed("French Bulldog");
        frenchie.setBreed(new Breed("French Bulldog")); //calling a method with parameter which is new object of type Breed
        frenchie.setBreed(frBulldog); //calling a method with parameter with an object (same as above)
        frenchie.setHasTail(false);
        frenchie.setName("Morti");
        frenchie.setAddress(dogAddress); //Dog has Address
        frenchie.printData();

        Dog huscky = new Dog(true, "Sara", 6, new Breed("Hucky"), dogAddress); //constructor with parameters
        huscky.printData();


        Address parrotAddress = new Address();
        parrotAddress.setStreetName("some street");
        parrotAddress.setCity("some city");
        parrotAddress.setPostalCode(12345);
        Parrot parrotAra = new Parrot(true, "Poly", 12, new Breed("Ara"), parrotAddress);

        parrotAra.setAge(12);
        parrotAra.setBreed(new Breed("Ara"));
        parrotAra.setHasTail(true);
        parrotAra.setName("Poly");
        parrotAra.setAddress(parrotAddress);
        parrotAra.printData();
        Breed ara = new Breed("Ara");
        Breed small = new Breed("Small");


//        Parrot parrot2 = new Parrot();
//        Address parrot2Address = new Address();
//        parrot2Address.setStreetName("some street");
//        parrot2Address.setCity("some city");
//        parrot2Address.setPostalCode(12345);
//
//        parrot2.setAge(12);
//        parrot2.setBreed(new Breed("Cacadu"));
//        parrot2.setHasTail(true);
//        parrot2.setName("Pacy");
//        parrot2.setAddress(parrotAddress);
//        parrot2.printData();

        System.out.println(parrotAra.isHasTail());

        frenchie.run();
        parrotAra.run();

        System.out.println(parrotAra.isExpensive(ara));
        System.out.println(parrotAra.isExpensive(small));

        if (parrotAra.isExpensive()){
            System.out.println("You can`t buy that!");
        }else {
            System.out.println("You can buy one!");
        }
    }
}
