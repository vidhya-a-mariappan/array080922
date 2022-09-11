import java.io.*;
public class reversalBlockswap {
    // Function to left rotate arr[] of size n by d
    static void leftRotate(int arr[], int d) {
        if (d == 0)
            return;
        int n = arr.length;
        // in case the rotating factor is
        // greater than array length
        d = d % n;
        reverseArray(arr, 0, d - 1);
        reverseArray(arr, d, n - 1);
        reverseArray(arr, 0, n - 1);
    }

    //Function to reverse arr[] from index start to end
    static void reverseArray(int arr[], int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    //function to print an array
    static void printArray(int arr[]) {
        System.out.println("Array rotation using reversal method");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
    public static void leftRotateBS(int arr[], int d,
                                  int n)
    {
        leftRotateRec(arr, 0, d, n);
    }

    public static void leftRotateRec(int arr[], int i,
                                     int d, int n)
    {
        /* Return If number of elements to be rotated
        is zero or equal to array size */
        if(d == 0 || d == n)
            return;

        /*If number of elements to be rotated
        is exactly half of array size */
        if(n - d == d)
        {
            swap(arr, i, n - d + i, d);
            return;
        }

        /* If A is shorter*/
        if(d < n - d)
        {
            swap(arr, i, n - d + i, d);
            leftRotateRec(arr, i, d, n - d);
        }
        else /* If B is shorter*/
        {
            swap(arr, i, d, n - d);
            leftRotateRec(arr, n - d + i, 2 * d - n, d); /*This is tricky*/
        }
    }

    /*UTILITY FUNCTIONS*/
    /* function to print an array */
    public static void printArrayBS(int arr[], int size)
    {
        int i;
        System.out.println("Array Rotation using block swap algorithm");
        for(i = 0; i < size; i++)
           System.out.print(arr[i] + " ");
            System.out.println();
    }

    /*This function swaps d elements
    starting at index fi with d elements
    starting at index si */
    public static void swap(int arr[], int fi,
                            int si, int d)
    {
        int i, temp;
        for(i = 0; i < d; i++)
        {
            temp = arr[fi + i];
            arr[fi + i] = arr[si + i];
            arr[si + i] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        int d = 2;
        leftRotateBS(arr, 2, 7);
        printArrayBS(arr, 7);
        leftRotate(arr, d);
        printArray(arr);
    }
}
