import java.util.*;
public class matrixAddSubScalarMultiply {
    public static void main(String[] args) {
        System.out.println("Enter the row,column of matrix and number to be multiply");
        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        int col = s.nextInt();
        int[][] mat1 = new int[row][col];
        int[][] mat2 = new int[row][col];
        int scalar = s.nextInt();
        System.out.println("Enter " + row * col + " elements of two arrays");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++)
                mat1[i][j] = s.nextInt();
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++)
                mat2[i][j] = s.nextInt();
        }
        addition(mat1, mat2);
        subtraction(mat1, mat2);
        scalarmultiply(mat1, scalar);
    }

    static void addition(int[][] mat1, int[][] mat2) {
        int[][] sum = new int[mat1.length][mat1.length];
        System.out.println("Matrix addition");
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1.length; j++) {
                sum[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void subtraction(int[][] mat1, int[][] mat2) {
        int[][] sub = new int[mat1.length][mat1.length];
        System.out.println("Matrix Subtraction");
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat2.length; j++) {
                sub[i][j] = mat1[i][j] - mat2[i][j];
                System.out.print(sub[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void scalarmultiply(int[][] mat1, int scalar) {
        int[][] smat = new int[mat1.length][mat1.length];
        System.out.println("Scalar multiplication");
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1.length; j++) {
                smat[i][j] = mat1[i][j] * scalar;
                System.out.print(smat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
