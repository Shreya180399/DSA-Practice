import java.util.Scanner;

public class FindSumOfEvenEle 
{
    public int sumOfEven(int[] a)
    {
        int sum = 0;
        
        for(int i=0; i<a.length; i++)
        {
            if(a[i] % 2 == 0)
            {
                sum = sum + a[i];
            }
        }

        return sum;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter length of an array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are:");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        FindSumOfEvenEle fm = new FindSumOfEvenEle();

        int add = fm.sumOfEven(arr);

        System.out.println("The sum of even elements from array is : " + add);

    }    
}
