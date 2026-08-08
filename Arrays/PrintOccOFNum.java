import java.util.Scanner;

public class PrintOccOFNum 
{
    public static void countOcc(int[] a)
    {
        for(int i=0; i<a.length; i++)
        {
            boolean alreadyPresent = false;

            for(int j=0; j<i; j++)
            {
                if (a[i] == a[j]) 
                {
                    alreadyPresent = true;
                    break;    
                }
            }

            if(alreadyPresent)
            {
                continue;
            }
            int occ = 0;
            for(int k=0; k<a.length; k++)
            {
                if (a[i] == a[k]) 
                {
                    occ++;    
                }
            }

            System.out.println(a[i] + " occured " + occ + " times !");
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
        
        countOcc(arr);
    }
    
}