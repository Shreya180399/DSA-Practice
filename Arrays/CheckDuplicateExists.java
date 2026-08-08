import java.util.Scanner;

public class CheckDuplicateExists {
    public static void checkDuplicates(int[] a) {
        boolean check = false;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    check = true;
                    break;
                }
            }
        }

        if (check) {
            System.out.println("Duplicates are present!");
        } else {
            System.out.println("Duplicates are not present!");
        }
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

        CheckDuplicateExists.checkDuplicates(arr);
    }
}
