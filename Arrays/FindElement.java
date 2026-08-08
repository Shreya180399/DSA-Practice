import java.util.Scanner;

public class FindElement
{
    public static void findEle(int[] a, int x)
    {
        boolean found = false;
        for(int i=0; i<a.length; i++)
        {
            if(a[i] == x)
            {
                found = true;
                break;
            }
        }

        if (found) 
        {
            System.out.println("Element is found!");    
        }
        else
        {
            System.out.println("Element is not found!");
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

        System.out.println("Enter the element:");
        int b = sc.nextInt();

        FindElement fe = new FindElement();

        FindElement.findEle(arr, b);
    }
}