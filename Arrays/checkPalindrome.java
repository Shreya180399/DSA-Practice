import java.util.Scanner;

public class checkPalindrome 
{
    public boolean checkPalindrome(int[] a)
    {
        int start = a[0];
        int end = a[a.length - 1];

        boolean check = true;

        while (start <= end) 
        {
            if (a[start] != a[end])
            {
                check = false;
                break;    
            }   
            start++;
            end--; 
        }
        return check;
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

       checkPalindrome cp = new checkPalindrome();

       boolean isPalindrome = cp.checkPalindrome(arr);

       if (isPalindrome) 
       {
            System.out.println("Array is palindrome!"); 
       }
       else
       {
        System.out.println("Array is not palindrome!");
       }
    }    
}