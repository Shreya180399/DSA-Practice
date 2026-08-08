import java.util.Scanner;

public class CheckArrayAreEqual 
{
    public static void checkEqual(int[] a, int[] b)
    {
        if(a.length != b.length)
        {
            System.out.println("Arrays are not equal!");
            return;
        }

        boolean check = true;

        for(int i=0; i<a.length; i++)
        {
            if (a[i] != b[i]) 
            {
                check = false;
                break;    
            }
        }  
        if (check) 
        {
            System.out.println("Arrays are equal!");    
        }    
        else
        {
            System.out.println("Arrays are not equal!");
        }  
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the length of first array :");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        System.out.println("Enter array elements :");
        for(int i=0; i<n; i++)
        {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Array elements are:");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr1[i] + " ");
        }

        System.out.println();

        System.out.println("Enter the length of second array :");
        int m = sc.nextInt();

        int[] arr2 = new int[n];
        System.out.println("Enter array elements :");
        for(int i=0; i<n; i++)
        {
            arr2[i] = sc.nextInt();
        }

        System.out.println("Array elements are:");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr2[i] + " ");
        }

        System.out.println();
        
        CheckArrayAreEqual.checkEqual(arr1, arr2);
    }    
}
