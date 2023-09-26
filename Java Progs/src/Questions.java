import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        //count the no of digits for a given num of n
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        int numOfDigits = 0;
//        int original_num = num;
//        while(num>0){
//            num = num/10;
//            numOfDigits++;
//        }
//        System.out.println("no of digits " + original_num + " = " + numOfDigits);

        // sum of given n digits
        int sumOfdigits = 0;
        int original_num = num;
        while(num>0){
            sumOfdigits+=num%10;
            num /= 10;
        }
        System.out.println("no of digits " + original_num + " = " + sumOfdigits);
    }
}
