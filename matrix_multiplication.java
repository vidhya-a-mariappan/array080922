import java.util.Scanner;
public class matrix_multiplication {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter row and column value of 2 matrix: say 2*2 and 2*3 means 2 2 2 3");
        int row1 = s.nextInt();
        int col1 = s.nextInt();
        int row2 = s.nextInt();
        int col2 = s.nextInt();
        int r = 0, c = 0;
        int[][] mat1 = new int[row1][col1];
        int[][] mat2 = new int[row2][col2];
        int[][] resMat = new int[100][100];
        if (col1 != row2)
            System.out.println("Please enter matrix in the way,\nNo. of columns in first matrix must be equal to no. of rows in second matrix\nOtherwise multiplication can't be performed");
        else{
        System.out.println("Enter " + row1 * col1 + " elements of first matrix");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++)
                mat1[i][j] = s.nextInt();
        }
        System.out.println("Enter " + row2 * col2 + " elements of second matrix");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++)
                mat2[i][j] = s.nextInt();
        }

            if (row1 * col1 > row2 * col2) {
                r = row1;
                c = col1;
            } else {
                r = row2;
                c = col2;
            }
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    resMat[i][j] = 0;
                    for (int k = 0; k < r; k++)
                        resMat[i][j] += mat1[i][k] * mat2[k][j];
                    System.out.print(resMat[i][j] + " ");  //printing matrix element
                }
                System.out.println();
            }
        }
    }
}


