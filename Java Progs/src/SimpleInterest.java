import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter principle ");
        float p = sc.nextFloat();

        System.out.print("enter rate ");
        float r = sc.nextFloat();

        System.out.print("enter time ");
        float t = sc.nextFloat();

        float si = (p*r*t)/100;

        System.out.println("SI = "+si);
    }
}
