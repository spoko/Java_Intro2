package randomeexamples;

import java.util.Scanner;

public class ParseIntDemo {
    public static void main(String[] args) {
        int [] testArray = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < testArray.length; i++) {
            System.out.println("Please enter number:");
            testArray[i] = Integer.parseInt(scanner.nextLine());
        }
    }
}
