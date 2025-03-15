import java.util.Scanner;
import java.util.Arrays;

public class Array4 {
    public static int secondLargest() {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();  // Close the scanner to prevent resource leaks

        Arrays.sort(arr);  // Sort the array in ascending order

        // Find the second largest element
        for (int j = arr.length - 2; j >= 0; j--) {
            if (arr[j] != arr[arr.length - 1]) {  // Check for distinct second largest
                return arr[j];
            }
        }
        return -1;  // If no second largest found (all elements are the same)
    }

    public static void main(String[] args) {
        int result = secondLargest();
        System.out.println("Second largest element: " + result);
    }
}
