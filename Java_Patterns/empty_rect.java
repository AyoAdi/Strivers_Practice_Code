package Java_Patterns;
import java.util.Scanner;


class rectExecute {
    int num;
    
    void pattern(int num){
        for(int j = 0; j <= num; j++){
            System.out.print("*");
        }
        System.out.println(" ");

        for(int j = 0; j < num-2; j++){
            System.out.print("*");
            for(int k = 0; k < num-1; k++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println(" ");
        }

        for(int j = 0; j <= num; j++){
            System.out.print("*");
        }
    }
    
}

class empty_rect{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the square: ");
        int n = sc.nextInt();

        rectExecute rt = new rectExecute();

        rt.pattern(n);
        sc.close();
    }   
}