import java.util.*;
public class SubSequenceOfString {
    public static void subSequenceOfString(String str,String andString){
        int len=0;
        
        if(str.length()==0){
            System.err.println(andString);

            return;
        }
        subSequenceOfString(str.substring(1), andString+str.charAt(0));
        subSequenceOfString(str.substring(1), andString);
        
       
      
       

    }
    public static int longestSubSequenceString(String str){
        return str.length();
    }
    public static void main(String[] args) {
        String str="abc";
        System.out.println();
        subSequenceOfString(str,"");
        int ans=longestSubSequenceString(str);
        System.out.println(ans);
    }
    
}
