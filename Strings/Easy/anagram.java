package Strings.Easy;
import java.util.HashMap;

class anagrams{
    //Did using hashmap, i overcomplicated it i think
    boolean checkIfAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        
        HashMap<Character, Integer> s1 = new HashMap<>();
        HashMap<Character, Integer> t1 = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            if(s1.containsKey(s.charAt(i))){
                s1.put(s.charAt(i), s1.get(s.charAt(i)) + 1);
            }else{
                s1.put(s.charAt(i), 1);
            }
        }

        for(int i = 0; i < t.length(); i++){
            if(t1.containsKey(t.charAt(i))){
                t1.put(t.charAt(i), t1.get(t.charAt(i)) + 1);
            }else{
                t1.put(t.charAt(i), 1);
            }
        }

        //Compare

        if(s1.equals(t1)){
            return true;
        }
        return false;
    }
}

public class anagram {
    public static void main(String[] args) {
        anagrams a = new anagrams();
        String s = "anagram";
        String t = "nagraam";

        System.out.print(a.checkIfAnagram(s, t));
    }
}
