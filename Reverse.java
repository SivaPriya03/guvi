
import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.next();
        System.out.println(new StringBuilder(str).reverse().toString());
    }
    
}
