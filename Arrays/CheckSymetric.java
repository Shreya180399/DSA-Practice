import java.util.Scanner;

public class CheckSymetric 
{
    public static void checkIfSymmetric(int[] a)
    {
        int start = 0;
        int end = a.length-1;

        boolean check = false;

        while (start <= end) 
        {
            if (a[start] != a[end])
            {
                check = true;
                break;
            }
            start++;
            end--;
        }

        if (check) 
        {
            System.out.println("Array is not symmetric!");    
        }
        else
        {
            System.out.println("Array is symmetric!");
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
        
        CheckSymetric.checkIfSymmetric(arr);
    }    
}
