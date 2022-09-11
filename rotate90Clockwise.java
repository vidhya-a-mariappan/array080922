import java.util.Scanner;
public class rotate90Clockwise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value on n in n * n matrix");
        int n = s.nextInt();
        int[][] mat= new int[n][n];
        System.out.println("Enter " + n * n + " elements of second matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0 ; j < n; j++)
                mat[i][j] = s.nextInt();
        }
        //transpose of matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        // Reverse individual rows
        for (int i = 0; i < n; i++) {
            int low = 0, high = n - 1;
            while (low < high) {
                int temp = mat[i][low];
                mat[i][low] = mat[i][high];
                mat[i][high] = temp;
                low++;
                high--;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(mat[i][j] + " ");
            System.out.println();
        }
    }
}

