import java.util.Scanner;

public class MoveNegativeNumbersToBeggining 
{
    public static void moveNum(int[] a)
    {
        int start = 0;
        int end = a.length - 1;

        while (start < end) 
        {
            if (a[start] < 0) 
            {
                start++;    
            }
            else if(a[end] >= 0) 
            {
                end--;    
            }
            else
            {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
                
                start++;
                end--;
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

        moveNum(arr);

        System.out.println("After moving neg numbers in front :");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }

    }
    
}