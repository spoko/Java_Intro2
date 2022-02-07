package loops;

public class ForDemo {
    public static void main(String[] args) {

        for (int number = 1; number < 50; number *= 2) {
            System.out.printf("Current index is: %d%n", number);
        }
    }
}
