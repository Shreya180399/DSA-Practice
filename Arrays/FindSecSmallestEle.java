import java.util.Scanner;

public class FindSecSmallestEle 
{
    public int secondSmallest(int[] a)
    {
        int smallest = Integer.MAX_VALUE;
        int sec_smallest = Integer.MAX_VALUE;

        for(int i=0; i<a.length; i++)
        {
            if (a[i] < smallest) 
            {
                sec_smallest = smallest;
                smallest = a[i];    
            }
            else if(a[i] < sec_smallest && a[i] != smallest)
            {
                sec_smallest = a[i];
            }
        }

        return sec_smallest;
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

        FindSecSmallestEle fm = new FindSecSmallestEle();

        int second_smallest = fm.secondSmallest(arr);

        System.out.println("The second smallest element is :" + second_smallest);
    }    
}
