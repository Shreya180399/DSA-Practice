import java.util.Scanner;

public class CountPairsOfEvenSum 
{
    public static void countPairs(int[] a)
    {
        System.out.println("The pairs whose sum is equal to even number are :");
        for(int i=0; i<a.length; i++)
        {
            for(int j=i+1; j<a.length; j++)
            {
                if ((a[i] + a[j]) %2 == 0) 
                {
                    System.out.print("(" + a[i] + " , " + a[j] + ")" + " ");    
                }
            }
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the length of an array :");
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
        
        CountPairsOfEvenSum.countPairs(arr);
    }    
}
