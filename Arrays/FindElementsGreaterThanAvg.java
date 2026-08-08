import java.util.Scanner;

public class FindElementsGreaterThanAvg 
{
    public static void findElements(int[] a)
    {
        float sum = 0;
        float avg = 0;

        for(int i=0; i<a.length; i++)
        {
            sum = sum + a[i];
        }

        avg = sum / a.length;

        System.out.println("Average is " + avg);

        int cnt = 0;
    
        System.out.println("Elements greater than average are :");
        for(int i=0; i<a.length; i++)
        {
            if (a[i] > avg) 
            {
                System.out.print(a[i] + " ");    
                cnt++;
            }
        }

        System.out.println(cnt + " elements are greater than average!");
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

        FindElementsGreaterThanAvg.findElements(arr);
    }    
}
