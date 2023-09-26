import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binary_num = sc.nextInt();
        int ans = 0;
        int pw = 1; // 2^0=1
        while(binary_num>0){
            int decimal_num = binary_num % 10;
            ans+= (decimal_num * pw);
            binary_num/=10;
            pw*=2;
        }
        System.out.print(ans);
    }
}
