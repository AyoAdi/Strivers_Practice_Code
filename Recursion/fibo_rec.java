package Recursion;
import java.util.Scanner;

class executeTS{
    int outputt(int n){
        if(n == 1){
            return 1;
        }
        if(n <= 0){
            return 0;
        }

        int sum = outputt(n-1) + outputt(n-2);
        //System.out.println(sum); <-- this is to test if the outputs are correct or not
        return sum;
    }
}


public class fibo_rec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        executeTS ets = new executeTS();
        System.out.println(ets.outputt(n));
        sc.close();
    }
}
