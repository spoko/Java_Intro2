package mathdemo;

import java.util.Random;

public class MathDemo {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt(0, 100));
    }

    public static int findTriangleAreaByTwoSidesAndAngle(int a, int b, double angle){
        return (int) (0.5 * a * b * Math.sin(Math.toRadians(angle)));
    }
}
