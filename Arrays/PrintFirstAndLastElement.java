import java.util.Scanner;

public class PrintFirstAndLastElement 
{
    public static void printElements(int[] a)
    {
        int start = a[0];
        int last = a[a.length-1];

        System.out.println("The first element of array is : " + start);
        System.out.println("The last element of an array is : " + last);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the length of an array:");
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

        PrintFirstAndLastElement.printElements(arr);
    }    
}
