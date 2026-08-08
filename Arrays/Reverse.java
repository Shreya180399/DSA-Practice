import java.util.Scanner;

public class Reverse 
{
    public static void reverse(int[] a)
    {
        int start = 0;
        int end = a.length - 1;

        while (start < end) 
        {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;    
        }
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

        Reverse re = new Reverse();

        System.out.println("Before reversing an array:");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println("After reversing array :");
        re.reverse(arr);
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }    
}
