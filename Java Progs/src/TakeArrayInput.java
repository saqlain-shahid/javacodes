import java.util.Scanner;

public class TakeArrayInput {
    static int countOccurence(int[] arr, int x){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x){
                count++;
            }
        }
        return count;
    }

    static int lastOccurence(int[] arr, int x){
        int lastIndex=-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x){
                lastIndex=i;
            }
        }
        return lastIndex;
    }

    static boolean IsSorted(int[] arr){
        boolean check = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<arr[i-1]){
                check=false;
                break; // if 1 item is unsorted then no need to traverse to full length of array
            }
        }
        return check;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter " + n + " elements");
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

//        System.out.println("Enter X: ");
//        int x = sc.nextInt();

//        System.out.println("Count of X: " + countOccurence(arr,x));
//        System.out.println("Last Index of X: " + lastOccurence(arr,x));
        System.out.println("Sorted " + IsSorted(arr));



    }
}
