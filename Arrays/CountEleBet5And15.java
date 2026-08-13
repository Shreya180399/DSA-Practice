import java.util.Scanner;

public class CountEleBet5And15 
{
    public static void countEle(int[] a)
    {
        int cnt = 0;

        for(int i=0; i<a.length; i++)
        {
            if (a[i] > 5 && a[i] < 15) 
            {
                cnt++;
            }
        }
        System.out.println("The elements greater than 5 and less than 15 are :" + cnt);
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

        countEle(arr);
    }    
}
