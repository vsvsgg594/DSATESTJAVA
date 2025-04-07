import java.util.*;
public class SecondApprochToFindPalidromString {
    public static boolean isPalidrom(String str){
        int i=0;
        int j=str.length()-1;
        boolean ans=false;
        while (i<=j) {
            if(str.charAt(i)==str.charAt(j)){
                ans=true;

            }
            i++;
            j--;
            
        }
        return ans;
    }
    public static void main(String[] args) {
        boolean ans=isPalidrom("abba");
        System.out.println(ans);
        
    }
    
}
