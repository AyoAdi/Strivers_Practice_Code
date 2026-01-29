package Java_Patterns;
import java.util.Scanner;

class execute {
    int num;

    void pattern(int num){
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}

class number_triangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter the size of triangle: ");
        execute nt = new execute();

        nt.pattern(n);

        sc.close();
    }
}