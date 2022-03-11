package exceptionsdemo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReader {

    public static void readFile(String fileName) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(fileName);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));

        String tmp = null;
        while ((tmp = bufferedReader.readLine()) != null){
            System.out.println(tmp);
        }
        bufferedReader.close();
        fileInputStream.close();
    }

    //example of catching and throwing new different exception
    public static int divide2Numbers(int a, int b) throws CustomException {
        try{
            return  a/b;
        }catch (ArithmeticException e){//cause when try to divide by 0
            throw new CustomException(e.getMessage() + " is not possible in this universe :)");
            // throwing new custom exception
        }
    }
}
