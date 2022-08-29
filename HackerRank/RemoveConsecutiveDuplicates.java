package HackerRank;

public class RemoveConsecutiveDuplicates {

    /**
     *  Remove Consecutive duplicates Write the logic to remove only consecutive duplicates
     * input ["aabbcde"]-> output["abcde"]
     * input ["aabbcc"]-> output["abc"]
     */


    /**
     *  check how many
     *
     *
     *
     *
     */

    public static String removeDuplicates(String s){

        String result="";
        if(s.length()==1){
            return s;
        }else{

            result+=s.charAt(0);


            for(int i=1;i<s.length();i++){
                if(s.charAt(i-1)!=s.charAt(i)){
                    result+=s.charAt(i);
                }

            }




        }




        return result;
    }



    public static String removeConsecutiveDuplicates(String s){
        String result="";
        if(s.length()==1){
            return s;
        }
        result+=s.charAt(0);
        for(int i=1;i<s.length();i++){
            if(s.charAt( i-1)!=s.charAt(i)){
                result+=s.charAt(i);
            }
        }
        return result;
    }


    public static void main(String[] args) {

        System.out.println(removeConsecutiveDuplicates("aaaabbbbcccc"));



    }
}
