package Java_Patterns;
import java.util.Scanner;


class toExecute {
    int num;
    
    void pattern(int num){
        for(int i = 0; i <= num; i++){
            //Space
            for(int j = 0; j < num - i - 1; j++){
                System.out.print(" ");
            }

            //Stars
            for(int j = 0; j < (2*i) - 1; j++)
                System.out.print("*");
            
            //Space
            for(int j = 0; j < num - i - 1; j++){
                System.out.print(" ");
            }

            System.out.println(" ");
        }
    }
}

class full_triangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the triangle: ");
        int n = sc.nextInt();

        toExecute rt = new toExecute();

        rt.pattern(n);
        sc.close();
    }   
}