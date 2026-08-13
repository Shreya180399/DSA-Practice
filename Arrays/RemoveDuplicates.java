import java.util.Scanner;

public class RemoveDuplicates 
{
    public static void removeDup(int[] a)
    {
        int k=0; 

        for(int i=0; i<a.length; i++)
        {
            boolean alreadyPresent = false;
            for(int j=0; j<i; j++)
            {
                if (a[i] == a[j]) 
                {
                    alreadyPresent = true;
                    break;    
                }
            }
            if (alreadyPresent) 
            {
                continue;    
            }
            a[k] = a[i];
            k++;
        }

        System.out.println("After removing duplicates, the elements are:");
        for(int i=0; i<k; i++)
        {
            System.out.print(a[i] + " ");
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

        removeDup(arr);
    }    
}
