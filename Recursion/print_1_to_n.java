package Recursion;
import java.util.Scanner;

class exeCute{
    void output(int n){
        if(n <= 0){
            return;
        }
        System.out.println(n);
        output(n-1);
    }
}

public class print_1_to_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        exeCute ec = new exeCute();
        ec.output(n);
        sc.close();
    }
}
