import java.util.Scanner;

public class RotateArr {
    static int[] rotate(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        int[] ans = new int [n];
        int j = 0;

        for (int i = n-k; i < n ; i++) {
            arr[j++] = arr[i];
        }

        for (int i = 0; i < n-k ; i++) {
            arr[j++] = arr[i];
        }
        return ans;
    }

    static void printArr(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        System.out.println("Original Array");
        printArr(arr);
        System.out.println();
        int[] ans = rotate(arr, k);
        System.out.println("Array after rotation");
        printArr(ans);
    }
}
