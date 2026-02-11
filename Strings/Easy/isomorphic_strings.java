package Strings.Easy;
import java.util.HashMap;


class isomorphicStrings{
    boolean outp(String s, String t){
        HashMap<Character, Character> s1 = new HashMap<>();
        HashMap<Character, Character> s2 = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            if(s1.containsKey(s.charAt(i)) && s1.get(s.charAt(i)) != t.charAt(i)){
                return false;
            }
            s1.put(s.charAt(i), t.charAt(i));
        }

        for(int i = 0; i < s.length(); i++){
            if(s2.containsKey(t.charAt(i)) && s2.get(t.charAt(i)) != s.charAt(i)){
                return false;
            }
            s2.put(t.charAt(i), s.charAt(i));
        }

        if(s1.size() == s2.size()){
            return true;
        }
        return false;
    }
 }


public class isomorphic_strings {
    public static void main(String[] args) {
        String s = "bbbaaaba";
        String t = "aaabbbba";

        isomorphicStrings i = new isomorphicStrings();
        System.out.print(i.outp(s, t));
    }
}
