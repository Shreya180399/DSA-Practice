import java.util.Scanner;

public class CountNoAppearance 
{
    public int countAppearance(int[] a, int key)
    {
        int cnt = 0;
        for(int i=0; i<a.length; i++)
        {
            if (a[i] == key) 
            {
                cnt++;    
            }
        }

        return cnt;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter length of an array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements :");
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

        System.out.println("Enter the number whose count you want to find:");
        int no = sc.nextInt();

        CountNoAppearance ca = new CountNoAppearance();

        int count = ca.countAppearance(arr, no);

        System.out.println("The cnt of " +  no + " is :" + count);
    }    
}
