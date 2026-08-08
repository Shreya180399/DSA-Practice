import java.util.Scanner;

public class LeftRotateArrrayBy1 
{
    public static void leftRotate(int[] a)
    {
        int start = a[0];

        for(int i=0; i<a.length-1; i++)
        {
            a[i] = a[i+1];
        }
        a[a.length - 1] = start;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter length of an array:");
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

        leftRotate(arr);

        System.out.println("After rotating array :");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}