import java.util.Scanner;

public class CountElementsEqualToAvg 
{
    public int cntEleEqualToAvg(int[] a)
    {
        int cnt = 0;

        int sum = 0;
        int avg = 0;

        for(int i=0; i<a.length; i++)
        {
            sum = sum + a[i];
        }

        avg = sum / a.length;

        System.out.println("The elements equal to average are : ");
        for(int i=0; i<a.length; i++)
        {
            if (a[i] == avg)
            {
                System.out.print(a[i] + " ");
                cnt++;
            }
        }
        return cnt;
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

        CountElementsEqualToAvg cn = new CountElementsEqualToAvg();

        int count = cn.cntEleEqualToAvg(arr);

        System.out.println("The total number of elements equal to average are :" + count);
    }    
}
