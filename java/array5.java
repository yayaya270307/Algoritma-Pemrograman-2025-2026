import java.io.*;
import java.lang.*;
import java.util.*;

public class array5 {
    public static int[] addX(int n, int arr[], int x) {
        int i;
        int newarr[] = new int[n + 1];

        for (i = 0; i < n; i++)
            newarr[i] = arr[i];

        newarr[n] = x;
        return newarr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };

        int n = arr.length;

        System.out.println("Initial Array:\n"
                + Arrays.toString(arr));

        int x = 4;

        arr = addX(n, arr, x);

        System.out.println("\nArray with " + x
                + " added:\n"
                + Arrays.toString(arr));
    }
}