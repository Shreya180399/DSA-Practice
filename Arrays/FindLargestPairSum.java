import java.util.Scanner;

public class FindLargestPairSum
{
    public static void findLargestSumPair(int[] a)
    {
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for(int i=0; i<a.length; i++)
        {
            if(a[i] > largest)
            {
                second_largest = largest;
                largest = a[i];
            }
            else if(a[i] > second_largest && a[i] != largest)
            {
                second_largest = largest;
                largest = a[i];
            }
        }

        System.out.println("The pair with largest sum is :" + "(" + largest + "," + second_largest + ")");    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of an array :");
        int n = sc.nextInt();


        int[] arr = new int[n];
        System.out.println("Enter array elements :");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are :");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        findLargestSumPair(arr);
    }
}