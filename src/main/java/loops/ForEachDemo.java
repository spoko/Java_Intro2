package loops;

public class ForEachDemo {
    public static void main(String[] args) {
        int [] numbers = {4, 9, 16, 20, 6};
        String [] cities = {"Sofia", "Plovdiv", "Burgas", "Varna"};

        for(int number : numbers) {
            System.out.println(number);
        }

        System.out.println("----------------");

        for(String city : cities) {
            System.out.println(city);
        }

        System.out.println("----------------");

        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i]);
        }
    }
}
