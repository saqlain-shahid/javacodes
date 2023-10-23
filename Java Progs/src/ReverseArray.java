public class ReverseArray {

    static int[] ReverseArr(int[] arr){
        int n = arr.length;
        int [] ans = new int[n];
        int j = 0;
        
        //traversing original arr in to backwards
        for (int i = n-1; i >=0 ; i--) {
            // this for traversing the arr and incrementing it
            ans[j++] = arr[i];
            // old way of writing
            //ans[j] = arr[i];
            // j++;
        }
        return ans;
    }

    static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
//    static void swapInArr(int[] arr, int i, int j){
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//
//    }
//    static void reverseArrSwap(int[] arr){
//        int i = 0, j = arr.length-1;
//
//        while(i<j){
//            swapInArr(arr,i,j);
//            i++;
//            j--;
//        }
//    }

    public static void main(String[] args) {
        int[] arr = {1,2,5,9,7,5};
        int[] ans = ReverseArr(arr);
        System.out.print("Reversed Array: ");
        printArr(ans);
    }
}
