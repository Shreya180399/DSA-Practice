import java.util.Scanner;

public class PrintUniqEle
{
    public static void printUniqueEle(int[] a)
    {
        for(int i=0; i<a.length; i++)
        {
            int cnt = 0;
            for(int j=0; j<a.length; j++)
            {
                if(a[i] == a[j])
                {
                    cnt++;
                }
            }
            if(cnt == 1)
            {
                System.out.println(a[i] + " is a unique element");
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of an array :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.err.println("Enter array elements :");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are :");
        for(int i=0; i<n ;i++)
        {
            System.out.println(arr[i] + " ");
        }

        System.out.println();

        printUniqueEle(arr);
    }
}