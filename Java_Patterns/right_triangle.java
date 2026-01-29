package Java_Patterns;
import java.util.Scanner;


class printThis {
    int num;
    
    void pattern(int num){
        for(int i = 0; i <= num; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

class right_triangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the triangle: ");
        int n = sc.nextInt();

        printThis rt = new printThis();

        rt.pattern(n);
        sc.close();
    }   
}

