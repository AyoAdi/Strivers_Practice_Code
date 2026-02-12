package Strings.Easy;
//Not super efficient, TC = O(N^2), because of how java should build a new string everytime and append, i think
//Best case is to use two pointers, find first and last position, and print
class reverseWordsInStr{
    String getTheStr(String input){
        String out = "";
        String x = " ";
        x += input.trim(); // Removes any spaces towards the end, but keeps in front for the sake of code logic
        int lastval = x.length();
        
        for(int i = x.length() - 2; i >= 0; i--){
            //Edge case
            if(x.charAt(i) == ' ' && x.charAt(i+1) == ' '){
                lastval = i;
                continue;
            }

            //Main case
            if(x.charAt(i) == ' ' && x.charAt(i+1) != ' '){
                out += x.substring(i+1, lastval);
                out += " ";
                lastval = i;
            }
        }

        out = out.trim();
        return out;
    }
}


public class reverse_words_in_given_str {
    public static void main(String[] args) {
        //String inp = "the sky is blue";
        String inp = "a good      example";
        reverseWordsInStr r = new reverseWordsInStr();
        System.out.print(r.getTheStr(inp));
    }
}
