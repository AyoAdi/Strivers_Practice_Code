package Recursion;
import java.util.Scanner;

class exeCutee{
    void output(int n){
        int count = 0;
        if(count >= n){
            return;
        }
        System.out.println(count);
        count++;
        output(count);
    }
}

public class print_n_to_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        exeCute ec = new exeCute();
        ec.output(n);
        sc.close();
    }
}
