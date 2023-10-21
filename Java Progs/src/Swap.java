import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter value of b: ");
        int b = sc.nextInt();
        int temp = a;
        a=b;
        b=temp;
        System.out.println("Value after swapping: a = "+a);
        System.out.println("Value after swapping: b = "+b);
    }
}
