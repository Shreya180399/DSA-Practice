import java.util.Scanner;

public class CountEvenOdd
{
    public static void evenOddEle(int[] a)
    {
        int even_cnt = 0;
        int odd_cnt = 0;

        for(int i=0; i<a.length; i++)
        {
            if (a[i] % 2 == 0) 
            {
                even_cnt++;
            }
            else
            {
                odd_cnt++;
            }
        }
        System.out.println("Number of even elements are :" + even_cnt);
        System.out.println("Number of odd elements are : " + odd_cnt);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of an array :");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
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
        
        evenOddEle(arr);

        sc.close();

    }
}