import java.util.Scanner;

public class SmallestEvenEle 
{
    public static void smallestEven(int[] a)
    {
        int smallest_even = Integer.MAX_VALUE;

        for(int i=0; i<a.length; i++)
        {
            if (a[i] % 2 == 0 && a[i] < smallest_even) 
            {
                smallest_even = a[i];    
            }
        }

        System.out.println("The smallest even element is :" + smallest_even);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter length of an array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements :");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are : ");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println();   
        
        smallestEven(arr);
    }    
}
