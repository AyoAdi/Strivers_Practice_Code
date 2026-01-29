package Java_Patterns;
import java.util.Scanner;

class Pattern{
    int num;

    void output(int num){
        for(int i = num; i >= 0; i--){
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

class reverse_right_triangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of pattern you want: ");
        int n = sc.nextInt();
        Pattern p = new Pattern();

        p.output(n);
        sc.close();
    }
}