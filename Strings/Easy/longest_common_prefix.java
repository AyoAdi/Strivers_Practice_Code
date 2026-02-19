package Strings.Easy;

class longestCommonPrefix{
    String getPrefixx(String[] arr){
        if(arr.length == 0){
            return "";
        }
        String shortestWord = "";
        int shortestWordLen = Integer.MAX_VALUE;

        //Getting shortest value
        for(int i = 0; i < arr.length; i++){
            if(arr[i].length() < shortestWordLen){
                shortestWordLen = arr[i].length();
                shortestWord = arr[i];
            }
        }

        int i = 0;
        String out= "";

        while(i < shortestWord.length()){
            String temp = Character.toString(shortestWord.charAt(i));
            boolean notPresentInAll = true;
            //Traversing the array
            for(int j = 0; j < arr.length; j++){
                if(!Character.toString(arr[j].charAt(i)).equals(temp)){
                    notPresentInAll = false;
                }
            }

            if(notPresentInAll == false){
                break;
            }else{
                out += temp;
                i++;
            }
        }
        return out;
    }
}



public class longest_common_prefix {
    public static void main(String[] args) {
        String[] arr = {"flower", "flowing", "flight"};
        //String[] strs = {"dog","racecar","car"};
        longestCommonPrefix lcp = new longestCommonPrefix();
        System.out.print(lcp.getPrefixx(arr));
    }
}
