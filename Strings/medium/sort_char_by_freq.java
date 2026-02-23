package Strings.medium;
import java.util.HashMap;

class sortCharByFreq{
    String getString(String inp){
        HashMap<Character, Integer> count = new HashMap<>();

        for(int i = 0; i < inp.length(); i++){
            if(count.containsKey(inp.charAt(i))){
                count.put(inp.charAt(i), count.get(inp.charAt(i) )+ 1);
            }else{
                count.put(inp.charAt(i), 1);
            }
        }

        return inp;

    }
}

public class sort_char_by_freq {
    public static void main(String[] args) {
        String inp = "tree";
        sortCharByFreq scf = new sortCharByFreq();
        System.out.print(scf.getString(inp));
    }
}
