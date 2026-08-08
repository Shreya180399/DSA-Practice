import java.util.Scanner;

public class MaxElement
{
    public int LargestElement(int[] a)
    {
        int max = a[0];

        for(int i=0; i<a.length; i++)
        {
            if(a[i] >= max)
            {
                max = a[i];
            }
        }

        return max;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        
        System.out.println("Enter array elements :");
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println();
        
        System.out.println("Array elements are:");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

        MaxElement me = new MaxElement();

        int largest = me.LargestElement(arr);

        System.out.print("The largest element is :" + largest);
    }
}