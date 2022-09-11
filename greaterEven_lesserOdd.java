import java.util.Arrays;
import java.util.Scanner;
public class greaterEven_lesserOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements in an array");
        int n=s.nextInt();
        int[] arr= new int[n];
        int[] resarr= new int[n];
        int count=0,i=0;
        System.out.println("Enter " + n + " elements of an array");
        for (i = 0; i < n; i++)
            arr[i]=s.nextInt();
        Arrays.sort(arr);
        if(n%2 == 1) {
            System.out.print(arr[(n / 2)] + " ");
            for (i = 1; i <= n / 2; i++)
                System.out.print(arr[(n / 2) + i] + " " + arr[(n / 2) - i] + " ");
        }
        else{
            System.out.print(arr[(n / 2)-1] + " ");
            for (i = 1; i < n / 2; i++)
                System.out.print(arr[(n / 2)-1 + i] + " " + arr[(n / 2)-1 - i] + " ");
            System.out.print(arr[n-1]);

        }
    }
}
