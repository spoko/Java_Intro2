package loops;

public class DoWhileDemo {
    public static void main(String[] args) {
        int number = 4;

        do{
            System.out.printf("Current number is: %d%n", number);
            number++;
        }while (number <= 5);
    }
}
