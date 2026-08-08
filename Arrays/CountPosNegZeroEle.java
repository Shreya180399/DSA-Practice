import java.util.Scanner;

public class CountPosNegZeroEle 
{
    public static void countNos(int[] a)
    {
        int pos_cnt = 0;
        int neg_cnt = 0;
        int zero_cnt = 0;

        for(int i=0; i<a.length; i++)
        {
            if (a[i] > 0) 
            {
                pos_cnt++;
            }
            else if(a[i] < 0)
            {
                neg_cnt++;
            }
            else if(a[i] == 0)
            {
                zero_cnt++;
            }
        }
        System.out.println("The number of positive numbers are :" + pos_cnt );
        System.out.println("The number of positive numbers are :" + neg_cnt );
        System.out.println("The number of positive numbers are :" + zero_cnt );

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
        
        countNos(arr);

    }
}
