import java.util.Scanner;

public class MoveAllZeroesToEnd 
{
    public static void moveZeroes(int[] a)
    {
        int k = 0;

        for(int i=0; i<a.length; i++)
        {
            if (a[i] != 0) 
            {
                a[k] = a[i]; 
                k++;   
            }
        }
        while (k < a.length) 
        {
            a[k] = 0;
            k++;    
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter length of an array :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements :");
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

        moveZeroes(arr);

        System.out.println("After moving zeroes to end :");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    
}