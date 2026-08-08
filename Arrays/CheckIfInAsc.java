import java.util.Scanner;

public class CheckIfInAsc 
{
    public static void checkAsc(int[] a)
    {
        boolean check = true;
        for(int i=0; i<a.length-1; i++)
        {
            if (a[i] > a[i+1]) 
            {
                check = false;  
                break;  
            }
        }

        if (check) 
        {
            System.out.println("Arary is in ascending order!");    
        }
        else
        {
            System.out.println("Array is not in ascending order!");
        }
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

        checkAsc(arr);
    }
}
