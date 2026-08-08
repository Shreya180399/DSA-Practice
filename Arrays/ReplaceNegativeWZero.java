import java.util.Scanner;

public class ReplaceNegativeWZero 
{
    public static void replaceWithZero(int[] a)
    {
        for(int i=0; i<a.length; i++)
        {
            if (a[i] < 0) 
            {
                a[i] = 0;    
            }
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the length of an array:");
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

        ReplaceNegativeWZero rz = new ReplaceNegativeWZero();

        rz.replaceWithZero(arr);

        System.out.println("After replacing with zero the updated array is :");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }    
}
