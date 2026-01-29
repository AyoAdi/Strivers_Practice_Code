package Basic_Math;
import java.util.Scanner;

class Implementt {
    int reverse(int x) {
        int useHere = x;

        if(useHere == Integer.MAX_VALUE || useHere == Integer.MIN_VALUE){
            return 0;
        }
        if(useHere < 0){
            useHere = -useHere;
        }
        String str = Integer.toString(useHere);

        String temp = "";

        for(int i = str.length()-1; i >= 0; i--){
            char c = str.charAt(i);
            temp = temp + c;
        }

        if(Long.parseLong(temp) > Integer.MAX_VALUE || Long.parseLong(temp) < Integer.MIN_VALUE){
            return 0;
        }

        int output = Integer.parseInt(temp);
        if(x < 0){
            output = -output;
        }
        return output;
    }
        
}

class reverse_no{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        Implementt im = new Implementt();
        System.out.print(im.reverse(input));
        sc.close();
    }
}

/*Python Code

*/