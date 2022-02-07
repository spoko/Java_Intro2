package arraysdemo;

public class ArraysDemo {
    static String [] names = new String[3];
    static double [] doubleNumbers = new double[5];
    static boolean [] answers = new boolean[10];

    public static void main(String[] args) {
        int [] numbers = {4, 9, 16, 20, 6};
        String [] cities = {"Sofia", "Plovdiv", "Burgas", "Varna"};
        //System.out.println(cities);

        System.out.println("Values in array names before filling in: ");
        printNames();
        fillInNames();
        System.out.println("Values in array names after filling in: ");
        printNames();

        doubleNumbers[2] = 0.5;
        doubleNumbers[3] = 0.7;

        for (int i = 0; i < doubleNumbers.length; i++) {
            System.out.println(doubleNumbers[i]);
        }
    }

    public static void fillInNames(){
        for (int i = 0; i < names.length; i++){
            names[i] = "some name";
        }
    }


    public static void printNames(){
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }

}
