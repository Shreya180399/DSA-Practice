import java.util.Scanner;

public class FirstEvenElement 
{
    public static void firstEvenEle(int[] a)
    {
        for(int i=0; i<a.length; i++)
        {
            if(a[i] % 2 == 0)
            {
                System.out.println(a[i] + " ");
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

        System.out.println("The first even element is:");
        firstEvenEle(arr);
    }    
}
