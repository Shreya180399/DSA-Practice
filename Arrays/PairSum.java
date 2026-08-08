import java.util.Scanner;

public class PairSum 
{
    public static void pairSum(int[] a, int target)
    {
        for(int i=0; i<a.length; i++)
        {
            for(int j=i+1; j<a.length; j++)
            {
                if (a[i] + a[j] == target) 
                {
                    System.out.print(" ( " + a[i] + " , " + a[j] + " ) ");    
                }
            }
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter length of an array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter sorted array elements :");
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

        System.out.println("Enter the target or sum you want : ");
        int addition = sc.nextInt();

        PairSum.pairSum(arr, addition);
    }    
}
