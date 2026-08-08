import java.util.Scanner;

public class FindSumOfEleGreaterThenAvg 
{
    public int sumOfEleGreaterThenAvg(int[] a)
    {
        int sum = 0;
        int avg = 0;

        for(int i=0; i<a.length; i++)
        {
            sum = sum + a[i];
        }

        avg = sum / a.length;

        System.out.println("Average of array elements is : " + avg);

        int add = 0;

        System.out.println("Elements greater than average are :");
        for(int i=0; i<a.length; i++)
        {
            if (a[i] > avg) 
            {
                System.out.print(a[i] + " ");
                add = add + a[i];    
            }
        }

        return add;
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

        FindSumOfEleGreaterThenAvg fs = new FindSumOfEleGreaterThenAvg();

        int addition = fs.sumOfEleGreaterThenAvg(arr);

        System.out.println("Sum of elements greater than average is :" + addition);

    }    
}
