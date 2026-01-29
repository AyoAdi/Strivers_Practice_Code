package Basic_Math;
import java.util.Scanner;
import java.lang.Math;

class executeOut{
    int number;
    boolean output(int number){
        String forLen = Integer.toString(number);
        int power = forLen.length();
        int sum = 0;
        for(int i = 0; i < power; i++){
            char no = forLen.charAt(i);
            int intNo = no - '0';
            sum = sum + (int)Math.pow(intNo, power);
        }
        
        if(number == sum){
            return true;
        }
        return false;
    }
}
public class armstrong_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the armstrong number: ");
        int number = sc.nextInt();
        executeOut eo = new executeOut();
        System.out.print(eo.output(number));
        sc.close();
    }
}
