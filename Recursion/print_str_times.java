package Recursion;
import java.util.Scanner;

class recurse{
    int n;
    void executeit(String str, int n){
        if(n<=0){
            return;
        }
        System.out.println(str);
        executeit(str, n-1);
    }
}

public class print_str_times {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string you want to be repeated: ");
        String str = sc.nextLine();
        System.out.print("Enter the number of times: ");
        int n = sc.nextInt();
        recurse r = new recurse();
        r.executeit(str,n);
        sc.close();
    }
}
