import java.util.Scanner;

public class FindNosGreaterThanKey 
{
    public static void findNoOfGreaterNos(int[] a, int key)
    {
        int cnt = 0;

        for(int i=0; i<a.length; i++)
        {
            if (a[i] > key) 
            {
                cnt++;    
            }
        }

        System.out.println("The total no. of elements which are greater than" +  key + " are : " + cnt);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter length of an array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
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

        System.out.println("Enter the key :");
        int a = sc.nextInt();

        FindNosGreaterThanKey.findNoOfGreaterNos(arr, a);
    }    
}
