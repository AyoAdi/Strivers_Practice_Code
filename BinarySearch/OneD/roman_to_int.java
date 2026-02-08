package BinarySearch.OneD;
import java.util.Dictionary;

import java.util.Hashtable;

class romanToInt{
    int getOut(String s){
        Dictionary<Character, Integer> d = new Hashtable<>();

        d.put('I',1);
        d.put('V',5);
        d.put('X', 10);
        d.put('L',50);
        d.put('C',100);
        d.put('D',500);
        d.put('M',1000);

        for(int i = 0; i < s.length(); i++){
            System.out.println(d.get(s.charAt(i)));
        }
        return 0;
    }
}

public class roman_to_int {
    public static void main(String[] args) {
        String s = "III";
        romanToInt ri = new romanToInt();
        System.out.print(ri.getOut(s));
    }
}
