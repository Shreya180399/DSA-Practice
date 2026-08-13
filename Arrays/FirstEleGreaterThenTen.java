import java.util.Scanner;

public class FirstEleGreaterThenTen 
{
    public static void firstEle(int[] a)
    {
        for(int i=0; i<a.length; i++)
        {
            if (a[i] > 10) 
            {
                System.out.println("The first element which is greater than 10 is :" + a[i]);    
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
        
        firstEle(arr);
        
    }    
}
