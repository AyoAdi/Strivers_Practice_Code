package Java_Patterns;
import java.util.Scanner;


class executeThis {
    int num;
    
    void pattern(int num){
        for(int i = 1; i <= num; i++){
            for(int j = 0; j < i; j++){
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }
}

class repeated_num_triangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the triangle: ");
        int n = sc.nextInt();

        executeThis rt = new executeThis();

        rt.pattern(n);
        sc.close();
    }   
}