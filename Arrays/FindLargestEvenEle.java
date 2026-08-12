import java.util.Scanner;

public class FindLargestEvenEle 
{
    public static int findLarEvenEle(int[] a)
    {
        int EvenLar = 0;
        for(int i=0; i<a.length; i++)
        {
            if (a[i] % 2 == 0 && a[i] > EvenLar) 
            {
                EvenLar = a[i];
            }
        }

        return EvenLar;
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

        System.out.println("The largest even number is :");

        System.out.println(findLarEvenEle(arr));
    }    
}
