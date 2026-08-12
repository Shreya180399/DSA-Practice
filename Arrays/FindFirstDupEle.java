import java.util.Scanner;

public class FindFirstDupEle 
{
    public static void findFirstDup(int[] a)
    {
        boolean check = false;
        for(int i=0; i<a.length; i++)
        {
            for(int j=i+1; j<a.length; j++)
            {
                if (a[i] == a[j]) 
                {
                    System.out.println("First duplicate element is :" + a[i]);
                    check = true;
                    break;
                }
            }
            if (check) 
            {
                break;    
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

        findFirstDup(arr);
    }    
}
