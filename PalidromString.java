import java.util.*;
public class PalidromString {
    public static boolean isPalidrom(String str,int i , int j){
        while(i<=str.length()-1 && j>=0){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
   

   
    public static void main(String[] args) {
        boolean ans=isPalidrom("vikash",0,4);
        System.out.println();
        System.out.println(ans);
        
    }
}
