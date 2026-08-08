import java.util.Scanner;

public class SwapFirstAndLast 
{
    public static void swap(int[] a)
    {
        int start = 0;
        int end = a.length-1;

        int temp = a[start];
        a[start] = a[end];
        a[end] = temp; 
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter length of an array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are:");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println();   

        System.out.println("After swapping first and last element the array is:");
        SwapFirstAndLast.swap(arr);
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }    

}
