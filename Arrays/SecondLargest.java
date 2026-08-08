import java.util.Scanner;

public class SecondLargest 
{
    public int secLargest(int[] a)
    {
        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;

        for(int i=0; i<a.length; i++)
        {
            if (a[i] >= max) 
            {
                secmax = max;
                max = a[i];    
            }
            else if(a[i] > secmax && a[i] != max)
            {
                secmax = max;
                max = a[i];
            }
        }

        return secmax;
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

        SecondLargest sl = new SecondLargest();

        System.out.println("The second max element is :" + sl.secLargest(arr));
    }    
}
