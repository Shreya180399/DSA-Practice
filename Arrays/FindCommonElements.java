import java.util.Scanner;

public class FindCommonElements 
{
    public static void findCommon(int[] a, int[] b)
    {
        System.out.println("The common elements are :");
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<b.length; j++)
            {
                if (a[i] == b[j]) 
                {
                    System.out.print(a[i] + " , ");    
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

        System.out.println("Enter length of second array :");
        int m = sc.nextInt();

        int[] brr = new int[m];

        System.out.println("Enter elements for second array: ");
        for(int i=0; i<m; i++)
        {
            brr[i] = sc.nextInt();
        }

        System.out.println("Elements of second array are :");
        for(int i=0; i<m; i++)
        {
            System.out.print(brr[i] + " ");
        }

        System.out.println();

        findCommon(arr, brr);
    }
    
}