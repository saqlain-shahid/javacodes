import java.util.Scanner;

public class LoopsQues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
//        int col = sc.nextInt();
        for(int i=1; i<=row; i++){
            //printing r-i spaces
            for(int j=1; j<=row-i; j++){
                System.out.print(" ");
            }
            //Print 1 to 2*i-1
            for (int k = 1;k<=2*i-1;k++){
                if(k==1||k==2*i-1||i==row){
                    System.out.print(i);
                }
                else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
}
