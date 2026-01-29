package Java_Patterns;
import java.util.Scanner;

class toBeexecute {
    int num;

    void pattern(int num){
        for(int i = -1; i <= num; i++){
            for(int j = 97; j <= 97+i; j++){
                System.out.print((char)j);
            }
            System.out.println(" ");
        }
    }
}

class letter_triangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of triangle: ");
        int n = sc.nextInt();
        toBeexecute nt = new toBeexecute();

        nt.pattern(n);

        sc.close();
    }
}