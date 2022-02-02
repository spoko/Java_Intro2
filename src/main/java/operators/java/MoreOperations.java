package operators.java;

import java.util.Scanner;

public class MoreOperations {
    public static void main(String[] args) {
        printDayOfTheWeek(3);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Month:");
        int enteredMonth = scanner.nextInt();
        System.out.println("Enter Year:");
        int enteredYear = scanner.nextInt();

        printNumberOfDaysInTheMonth(enteredMonth, enteredYear);
        printNumberOfDaysInTheMonth(5, 2012);

        int firstNumber = 10;
        int secondNumber = 6;

        //if operator
        System.out.println("-------");
        System.out.println(firstNumber == secondNumber ? "Numbers are equal" : "Numbers are not equal");
        System.out.println(firstNumber > secondNumber ? "First is greater" : "Second is greater");
        System.out.println("-------");

        if (firstNumber == secondNumber){
            System.out.println("Numbers are equal");
            System.out.println(firstNumber + secondNumber);
        }else if (firstNumber > secondNumber){
            System.out.println("First is greater");
            System.out.println(firstNumber - secondNumber);
        }else {
            System.out.println("Second is greater");
            System.out.println(secondNumber - firstNumber);
        }

    }

    public static void printDayOfTheWeek(int dayOfTheWeek){
        switch (dayOfTheWeek){
            case 1:
                System.out.println("Selected day is Mon");
                break;
            case 2:
                System.out.println("Selected day is Tue");
                break;
            case 3:
                System.out.println("Selected day is Wed");
                break;
            default:
                System.out.println("Not correct option!");
        }
    }

    public static void printNumberOfDaysInTheMonth(int month, int year){
        int numberOfDays = 0;
        switch (month){
            case 1:
                numberOfDays = 31;
                System.out.println("Selected Jan and it has " + numberOfDays);
                break;
            case 2:
                if ((year % 4 == 0) && (year % 100 !=0) || (year % 400 == 0)){
                    numberOfDays = 29;
                    System.out.println("Selected Feb and it has " + numberOfDays);
                }else {
                    numberOfDays = 28;
                    System.out.println("Selected Feb and it has " + numberOfDays);
                }
                break;
            default:
                System.out.println("Invalid data!");
        }
    }
}
