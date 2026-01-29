package Recursion;
import java.util.Scanner;

class exeCutedede{
    int output(int n){
        if(n <= 1){
            return 1;
        }
        int temp = n * output(n-1);
        return temp;
    }
}

public class fact_n_nos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        exeCutedede ec = new exeCutedede();
        System.out.print(ec.output(n));
        sc.close();
    }
}
