import java.util.Scanner;

public class FindAllPairsWGivSum
{
    public static void findPairs(int[] a, int target)
    {
        for(int i=0; i<a.length; i++)
        {
            for(int j=i+1; j<a.length; j++)
            {
                if (a[i] + a[j] == target) 
                {
                    System.out.print("(" + a[i] + "," + a[j] + ")");    
                }
            }
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

        System.out.println("Enter the sum you want to acheive :");
        int num = sc.nextInt();

        System.out.println();

        findPairs(arr, num);
    }
}