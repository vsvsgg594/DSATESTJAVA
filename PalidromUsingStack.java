import java.util.*;
public class PalidromUsingStack {
    public static boolean isPalidrom(String str,int i,int j){
        if(i>=j){
            return true;
        }
        if(str.charAt(i)!=str.charAt(j)){
            return false;
        }
        return isPalidrom(str, i+1, j-1);
    }
        
    public static void main(String[] args) {
        boolean ans=isPalidrom("abba", 0,3);
        System.out.println(ans);
        
    }
    
}
