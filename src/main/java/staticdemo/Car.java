package staticdemo;

public class Car extends DriveCar { //if this class is final it won`t be possible to be extended in Tesla class
    private String color; //nonstatic
    private static int counter; //static variable
    private static String engineType;
    public final static boolean FOUR_WHEEL_DRIVE = true; //constant can be public; final static means constant
    private final String brandName;//nonstatic variable
    //private final String brandName = "Toyota"; //if not initialized here shall be in the constructor

    //static initializer
    static {
        System.out.println("initializing engine type");
        engineType = "Gasoline";//not mandatory but all static can be initialized here
        //FOUR_WHEEL_DRIVE = true;//mandatory either here or when definied
    }//end static initializer

    public static int getCounter() {
        //color = "red"; //static method cannot use nonstatic fields
        return counter;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (!color.isEmpty()){
            this.color = color;
        }else {
            System.out.println("Invalid entry for color");
        }
    }

    public Car (String color, String brandName){
        setColor(color);
        this.brandName = brandName;
        counter++;
    }

    public final void printCarDetails(){
        System.out.println("Car details:");
        System.out.println("Car color " + this.color);
        System.out.println("Car brand " + this.brandName);
        System.out.println("Car engine type " + this.engineType);
        System.out.println("Car 4 wheel drive system " + this.FOUR_WHEEL_DRIVE);
    }

    //we extended an abstract method, that is why we are forced to override the following methods:
    @Override
    public void driveForward(String carIdentifier) {
        System.out.println(carIdentifier + " is going forward");
    }

    @Override
    public String driveBackward(String carIdentifier) {
        String result = carIdentifier + " is going forward";
        System.out.println(result);
        return result;
    }
}
