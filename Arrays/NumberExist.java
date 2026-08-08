import java.util.Scanner;

public class NumberExist
{
    public static void checkNumExist(int[] a, int target)
    {
        boolean exists = false;
        for(int i=0; i<a.length; i++)
        {
            if (a[i] == target) 
            {
                exists = true;
                break;    
            }
        }

        if (exists) 
        {
            System.out.println(target + " exists in the array list");    
        }
        else
        {
            System.out.println(target + " does not exist in the array list");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the length of an array :");
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

        System.out.println("Enter the number you want to check:");
        int x = sc.nextInt();

        checkNumExist(arr, x);
    }
}