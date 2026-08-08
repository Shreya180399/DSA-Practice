import java.util.Scanner;

public class AvgOfElements {
    public float avgOfEle(int[] a) {
        float sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }

        float avg = sum / a.length;

        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of an array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        AvgOfElements ae = new AvgOfElements();

        float average = ae.avgOfEle(arr);

        System.out.println("The average of elements of array is :" + average);
    }
}
