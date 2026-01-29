package Java_Patterns;
import java.util.Scanner;


class loopCode {
    int num;
    
    void pattern(int num){
        int beg = 1;
        for(int i = 0; i < num; i++){
            if(i % 2 == 0){
                beg = 1;
            }else{
                beg = 0;
            }
            for(int j = 0; j <= i; j++){
                System.out.print(beg);
                beg = 1 - beg;
            }
            System.out.println(" ");
        }
    }
}

class binary_triangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the triangle: ");
        int n = sc.nextInt();

        loopCode rt = new loopCode();

        rt.pattern(n);
        sc.close();
    }   
}