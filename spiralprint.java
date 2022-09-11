import java.util.Scanner;
public class spiralprint {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value on m and n in m * n matrix");
        int m = s.nextInt();
        int n = s.nextInt();
        int[][] a = new int[m][n];
        System.out.println("Enter " + m * n + " elements of matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                a[i][j] = s.nextInt();
        }
        int i, k = 0, l = 0;
        while (k < m && l < n) {
            // Print the first row
            for (i = l; i < n; ++i)
                System.out.print(a[k][i] + " ");
            k++;
            // Print the last column
            for (i = k; i < m; ++i)
                System.out.print(a[i][n - 1] + " ");
            n--;
            // Print the last row
            if (k < m) {
                for (i = n - 1; i >= l; --i)
                    System.out.print(a[m - 1][i] + " ");
                m--;
            }
            // Print the remaining first column
            if (l < n) {
                for (i = m - 1; i >= k; --i)
                    System.out.print(a[i][l] + " ");
                l++;
            }
        }
    }
}
