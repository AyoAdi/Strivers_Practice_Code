package Strings.Easy;

class largestOddNoInStr{
    String getOut(String in){
        for(int i = in.length()-1; i >= 0; i--){
            int val = in.charAt(i) - '0';

            if(val % 2 == 0){
                continue;
            }else{
                return in.substring(0,i+1);
            }
        }
        return " ";
    }
}


public class largest_odd_no_in_str {
    public static void main(String[] args) {
        String inp = "";

        largestOddNoInStr l = new largestOddNoInStr();
        System.out.print(l.getOut(inp));
    }
}
