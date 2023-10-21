import java.util.Scanner;

public class Swap {

    static void SwapWithoutTemp(int a, int b){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
         a = sc.nextInt();
        System.out.print("Enter value of b: ");
         b = sc.nextInt();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("Value after swapping: a = "+a);
        System.out.println("Value after swapping: b = "+b);

    }

    static void SwapNums(int a, int b){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
         a = sc.nextInt();
        System.out.print("Enter value of b: ");
         b = sc.nextInt();
        int temp = a;
        a=b;
        b=temp;
        System.out.println("Value after swapping: a = "+a);
        System.out.println("Value after swapping: b = "+b);
    }

    public static void main(String[] args) {
//       SwapWithoutTemp();
        SwapNums(5,9);
    }
}
