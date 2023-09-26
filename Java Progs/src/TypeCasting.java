import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //type casting
        int num = (int)67.67f;
        System.out.println(num);

        int a = 257;
        byte b = (byte)a; //257 % 256 = 1
        System.out.println(b);
    }
}
