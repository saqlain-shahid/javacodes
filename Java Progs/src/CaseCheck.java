import java.util.Scanner;
// uppercase or lowercase
public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //next char doesn't exist in java so we have to iterate it with chatAt() array index;
        //trim means just to trim spaces between words
        char ch = in.next().trim().charAt(0);
        if(ch >= 'A' && ch<='Z'){
            System.out.println("uppercase");
        }
        else if(ch>='a' && ch<='z'){
            System.out.println("lowercase");
        }
        else{
            System.out.println("numbers");
        }
    }
}
