import java.util.Scanner;

public class DifferenceBetLargestSmallest 
{
    public int differenceLarSmall(int[] a)
    {
        int max = Integer.MIN_VALUE;

        for(int i=0; i<a.length; i++)
        {
            if (a[i] >= max) 
            {
                max = a[i];    
            }
        }

        int min = Integer.MAX_VALUE;

        for(int i=0; i<a.length; i++)
        {
            if (a[i] <= min) 
            {
                min = a[i];    
            }
        }

        int difference = max - min;

        return difference;
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

        DifferenceBetLargestSmallest db = new DifferenceBetLargestSmallest();

        int diff = db.differenceLarSmall(arr);

        System.out.println("The difference between largest and smallest from array elements is : " + diff);
    }    
}
