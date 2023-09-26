import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your number: ");
        int num = sc.nextInt();
        String ans;
//        ans = (num%2==0) ? "even" : "odd";
//        System.out.println(ans);
//
        ans = (num%2==0 && num%3==0) ? "Required answer" : "Not getting required answer";
        System.out.println(ans);

    }
}
