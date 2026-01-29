package Basic_Math;
import java.util.Scanner;

class implement{
    int num;

    int soln(int num){
        String toChar = Integer.toString(num);
        
        return toChar.length();

    }
}

class count_digits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int inp = sc.nextInt();
        implement im = new implement();
        System.out.print("The number of digits in " + inp + " is " + im.soln(inp));
        sc.close();
    }
}