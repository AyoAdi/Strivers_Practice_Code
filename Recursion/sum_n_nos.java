package Recursion;
import java.util.Scanner;

class exeCutede{
    int output(int n){
        if(n <= 0){
            return 0;
        }
        int temp = n + output(n-1);
        return temp;
    }
}

public class sum_n_nos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        exeCutede ec = new exeCutede();
        System.out.print(ec.output(n));
        sc.close();
    }
}
