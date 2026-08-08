import java.util.Scanner;

public class FindIndexOfAnElement 
{
    public static void findIndex(int[] a, int key)
    {
        boolean found = false;

        for(int i=0; i<a.length; i++)
        {
            if(a[i] == key)
            {
                System.out.println("Element found at index :" + i);
                found = true;
                break;
            }
        }

        if (found == false) 
        {
            System.out.println("Element not found!");    
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of an array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Array elements are:");
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

        System.out.println("Enter element to be found :");
        int a = sc.nextInt();

        FindIndexOfAnElement.findIndex(arr, a);

    }    
}
