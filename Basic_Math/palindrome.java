package Basic_Math;
import java.util.Scanner;
//The .equals() is SUPER important. 
//This is because .equals() compares the values themselves, but == compares the reference points
//SO for primitive types of data, use ==, and for Wrapper classes and non primitives, use .equals()
//If == doesnt work go with .equals(). Should work

class ImpHere{
    boolean execute(int x){
        String input = Integer.toString(x);
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        String st = sb.toString();
        if(input.equals(st)){ 
            return true;
        }
        return false;
    }
}

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        ImpHere ih = new ImpHere();
        System.out.print(ih.execute(input));
        sc.close();
    }
}


//Python Code
//class Solution:
    //def isPalindrome(self, x: int) -> bool:
        //input = str(x)
        //reversed = input[::-1]
        //if input == reversed:
            //return True
        //return False