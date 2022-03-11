package exceptionsdemo;

public class CustomException extends Exception{// our custom exception will be checked now i.e. shall be caught or thrown

    public CustomException(String message){
        super(message);
    }
}
