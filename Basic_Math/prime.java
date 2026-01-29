package Basic_Math;
import java.util.Scanner;

class executeTs{
    void returnts(int n){
        int factorCount = 0;
        if(n <= 1){
            System.out.print("This number is not valid");
        }

        for(int i = 2; i <= n; i++){
            if(n%i == 0){
                factorCount++;
            }
        }

        if(factorCount <= 1){
            System.out.print("This number is a prime number");
        }else{
            System.out.print("This number is a composite number");
        }
    }
}

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println();
        executeTs et = new executeTs();
        et.returnts(n);
        sc.close();
    }
}
