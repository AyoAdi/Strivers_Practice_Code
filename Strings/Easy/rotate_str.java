package Strings.Easy;

class rotateString{
    boolean output(String s, String goal){
        if(s.length() != goal.length()){
            return false;
        }
        
        int count = s.length();
        String currentstr = s;
        while(count > 0){
            char firstChar = currentstr.charAt(currentstr.length()-1);
            String temp = "";
            temp += firstChar;
            //Rotate
            for(int i = 0; i<currentstr.length()-1; i++){
                temp += currentstr.charAt(i);
            }
            //check condition
            if(temp.equals(goal)){
                return true;
            }
            currentstr = temp;
            count--;
        }
        return false;
    }
}

public class rotate_str {
    public static void main(String[] args) {
        rotateString r = new rotateString();
        String s = "abcde";
        String goal = "eabcd";
        System.out.print(r.output(s, goal));
    }
}
