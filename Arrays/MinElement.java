import java.util.Scanner;

public class MinElement 
{
    public int SmallestElement(int[] a)
    {
        int min = a[0];

        for(int i=0; i<a.length; i++)
        {
            if(a[i] <= min)
            {
                min = a[i];
            }
        }
        return min;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of an array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for(int i=0; i<n ;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are:");
        for(int i=0; i<n; i++)
        {
            System.out.println(arr[i] + " ");
        }

        MinElement me = new MinElement();

        int smallest = me.SmallestElement(arr);

        System.out.println("The smallest element is :" + smallest);
    }
}