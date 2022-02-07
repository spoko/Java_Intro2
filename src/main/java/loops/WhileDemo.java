package loops;

public class WhileDemo {
    public static void main(String[] args) {
        int number = 0;

        while (number < 2){
            System.out.println("Current number is: " + number);
            number++;
        }

        calculateFactorial(0);
        calculateFactorial(1);
        calculateFactorial(4);
    }

    public static void calculateFactorial(int number){
        int factorial = 1;
        int iterator = number;

        while (iterator > 0){
            factorial *= iterator;
            iterator--;
        }
        System.out.printf("You have entered: %d. Factorial is: %d\n", number, factorial);
    }
}
