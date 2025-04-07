
import java.util.Stack;

public class PalidromUsingStck {
    public static boolean isPalidrom(String str){
        Stack<Character> st = new Stack<>();
        int j=str.length()-1;

        for(int i=0;i<str.length()-1;i++){
            st.push(str.charAt(i));
            if(st.get(i)!=str.charAt(j)){
                return false;
            }
            j--;



        }
        return true;
    }
    public static void main(String[] args) {
        boolean ans=isPalidrom("abba");
        System.out.println(ans);
        
    }
}
