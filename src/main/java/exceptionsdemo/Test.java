package exceptionsdemo;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {

        try{// try to do something
            FileReader.readFile("asdas");
            //here we can have more than one method
        } catch (FileNotFoundException e){//catch possible exception(s)
            System.out.printf("ERROR: File not found: %s%n", e.getMessage());
            //logic for saving logs
            //throw here
        } catch (IOException e){
            System.out.println("ERROR: Something went wrong with Input/ Output operations");
        }finally {
            System.out.println("I will be always executed");
        }

        try {
            System.out.println(FileReader.divide2Numbers(2,0));
        }catch (CustomException e) {
            System.out.println(e);
        }

    }
}
