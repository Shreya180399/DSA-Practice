import java.util.Scanner;

public class LastEven 
{
    public static void lastEvenNo(int[] a)
    {
        int lastEven = 0;

        for(int i=0; i<a.length; i++)
        {
            if (a[i] % 2 == 0) 
            {
                lastEven = a[i];    
            }
        }

        System.out.println("The last even element is :" + lastEven);
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

        lastEvenNo(arr);
    }
   
}
