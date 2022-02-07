package arraysdemo;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int [][] matrix = {
                {4, 9, 16, 20, 6},
                {5, 5, 12, 3},
                {1,2},
                {55, 67, 78}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("Element in position %d%d is %d%n", i, j, matrix[i][j]);
            }
        }
    }
}
