import java.util.Scanner;

public class FindEleLessThanAvg
{
    public static void findLessThanAvg(int[] a)
    {
        float sum = 0;
        float avg = 0;

        for(int i=0; i<a.length; i++)
        {
            sum = sum + a[i];
        }

        avg = sum / a.length;

        System.out.println("The average of array elements is :" + avg);

        System.out.println("The elements less than average are : ");
        for(int i=0; i<a.length; i++)
        {
            if (a[i] < avg) 
            {
                System.out.print(a[i] + " ");    
            }
        }
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

        FindEleLessThanAvg.findLessThanAvg(arr);
    }
}