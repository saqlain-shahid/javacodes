import java.util.Scanner;

class Algebra{
    int sum(int a, int b){
        int ans=a+b;
        return ans;
    }
}
public class CustomMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Algebra obj = new Algebra();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int ans = obj.sum(x,y);
        System.out.println(ans);

    }
}
