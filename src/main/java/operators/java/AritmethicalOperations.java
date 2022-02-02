package operators.java;

public class AritmethicalOperations {
    public static void main(String[] args) {
        int firstNumber = 5;
        int secondNumber = 2;

        //mind your type!
        double resultOfDivision = firstNumber / secondNumber;
        System.out.println(resultOfDivision);

        System.out.println(firstNumber / secondNumber);
        System.out.println(resultOfDivision);

        //% will return the remain of the /
        System.out.println(firstNumber % secondNumber);

        //increment
        System.out.println(++firstNumber);
        System.out.println(firstNumber);

        //decrement
        System.out.println(secondNumber--);
        System.out.println(secondNumber);

        int result = firstNumber + secondNumber;
        System.out.println("The sum is: " + result);

        result += firstNumber;

        System.out.println("The new sum is: " + result);

    }
}
