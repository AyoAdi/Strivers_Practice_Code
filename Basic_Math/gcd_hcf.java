package Basic_Math;
import java.util.Scanner;

class executeCode{
    int n1;
    int n2;

    int output(int n1, int n2){
        int max = 1;
        int small = n1;
        int big = n2;
        if(n1 < n2){
            small = n1;
            big = n2;
        }else{
            small = n2;
            big = n1;
        }
        for(int i = 2; i <= n1*n2; i++){
            if(small % i == 0 && big % 1 == 0){
                if(i > max){
                    max = i;
                }
            }
        }
        return max;
    }
}

class gcd_hcf{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = sc.nextInt();
        executeCode ec = new executeCode();
        System.out.print(ec.output(n1,n2));

        System.out.print(7/2);
        sc.close();
    }
}





