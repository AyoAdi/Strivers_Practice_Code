package Java_Patterns;
import java.util.Scanner;


class toExecuteed {
    int num;
    
    void pattern(int num){
        //Increasing Triangle
        for(int i = 1; i <= num; i++){
            //Stars
            for(int j = 0; j < i ; j++)
                System.out.print("*");
            
            System.out.println(" ");
        }

        //Decreasing Triangle
        for(int k = num-1; k > 0; k--){
            //Stars
            for(int j = 0; j <  k; j++)
                System.out.print("*");

            System.out.println(" ");

        }
    }
}

class right_polynomial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the triangle: ");
        int n = sc.nextInt();

        toExecuteed rt = new toExecuteed();

        rt.pattern(n);
        sc.close();
    }   
}