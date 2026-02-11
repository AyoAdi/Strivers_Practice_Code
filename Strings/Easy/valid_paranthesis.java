package Strings.Easy;

class validParanthesis{
    String getOut(String s){
        int openCount = 0;
        int closeCount = 0;
        String out = "";
        int start = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                openCount++;
            }
            if(s.charAt(i) == ')'){
                closeCount++;
            }

            if(openCount == closeCount){
                out = out + s.substring(start+1, i); //This actually excludes the outermost brackets,  i.e, start and i
                start = i+1;
            }
        }
        return out;
    }
}


public class valid_paranthesis {
    public static void main(String[] args) {
        String input = "(()())(())(()(()))";
        validParanthesis vp = new validParanthesis();
        System.out.print(vp.getOut(input));
    }
}
