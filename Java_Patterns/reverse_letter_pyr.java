package Java_Patterns;
import java.util.Scanner;

class toBeexecutted {
    int num;

    void pattern(int num){
        for(int i = num-1; i >= 0; i--){
            for(int j = 97; j <= 97+i; j++){
                System.out.print((char)j);
            }
            System.out.println(" ");
        }
    }
}

class reverse_letter_pyr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of triangle: ");
        int n = sc.nextInt();
        toBeexecutted tbe = new toBeexecutted();
        tbe.pattern(n);
        sc.close();
    }
}