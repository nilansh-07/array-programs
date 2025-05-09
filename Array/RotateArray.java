import java.util.Scanner;

public class RotateArray {
    static void rotate(int arr[], int size) {
        int start = 0;
        int end = size - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an Array:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements into the Array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The original array is:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
        System.out.println("The Rotated array is:");
        rotate(arr, size);
    }
}