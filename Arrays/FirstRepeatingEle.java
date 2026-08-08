import java.util.Scanner;

public class FirstRepeatingEle 
{
    public static void firstRepeatingEle(int[] a)
    {
        for(int i=0; i<a.length; i++)
        {
            for(int j=i+1; j<a.length; j++)
            {
                if (a[i] == a[j]) 
                {
                    System.out.println("first repeatating element found " + a[i]);  
                    break; 
                }
            }
            break;
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
        
        firstRepeatingEle(arr);
    }
}
