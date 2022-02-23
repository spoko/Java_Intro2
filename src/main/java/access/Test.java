package access;

public class Test {
    public static void main(String[] args) {

        //Create new instance of the product class
        Product product = new Product();

        //we can access the public name since it is public
        product.publicName = "";

        //we can access default name since Product and Test classes are in the same package
        product.defaultName = "";

        //we can access default name since Product and Test classes are in the same package
        product.protectedName = "";

        //we can`t access anything that is private outside the class:
        //product.privateName = "";

        //accessing private variable
        product.setPrivateName("");
        product.getPrivateName();
    }
}
