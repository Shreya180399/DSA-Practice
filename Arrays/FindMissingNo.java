import java.util.Scanner;

public class FindMissingNo 
{
    public int findMissing(int[] a)
    {
        int m = a.length + 1;

        int actual_sum = 0;
        int expected_sum = 0;

        expected_sum = m * (m+1) / 2;

        for(int i=0; i<a.length; i++)
        {
            actual_sum = actual_sum + a[i];
        }

        int missing = expected_sum - actual_sum;

        return missing;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter length of an array :");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements :");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are :");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println();  

        FindMissingNo fm = new FindMissingNo();

        int missing_no = fm.findMissing(arr);

        System.out.println("The missing number is :" + missing_no);

    }
    
}