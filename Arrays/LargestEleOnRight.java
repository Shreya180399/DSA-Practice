import java.util.Scanner;

public class LargestEleOnRight 
{
    public static void largestOnRight(int[] a)
    {
        for(int i=0; i<a.length; i++)
        {
            boolean check = true;
            for(int j=0; j<i; j++)
            {
                if (a[i] < a[j+1]) 
                {
                    int max = 0;
                     
                }
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
        
    }
}
