import java.util.Scanner;

public class ArrTripletSum {
    static int tripletsum(int[] arr, int target){
        int ans = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) { //searching for 1st number
            for (int j = i+1; j < n; j++) { //searching for 2nd number and [i+1 denoting next number for iteration]
                for (int k = j+1; k < n; k++) {//searching for 3rd number [j+1 denoting next number for iteration]
                    if (arr[i] + arr[j] + arr[k] == target){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target sum");
        int target = sc.nextInt();

        System.out.print("Target sum counts ");
        System.out.println(tripletsum(arr,target));
    }
}
