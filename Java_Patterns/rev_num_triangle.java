package Java_Patterns;
import java.util.Scanner;

class Patternn{
    int num;

    void output(int num){
        for(int i = num; i > 0; i--){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}

class rev_num_triangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of pattern you want: ");
        int n = sc.nextInt();
        Patternn p = new Patternn();

        p.output(n);
        sc.close();
    }
}