import java.util.Scanner;

public class Sub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nt number: ");
        int num2 = sc.nextInt();

        int sub = num1 - num2;
        System.out.println("Subracted Number: " + sub);

    }
}
