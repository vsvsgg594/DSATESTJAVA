import java.util.*;
import java.util.Stack;
public class ParantrhesChecker {
    public static boolean isBalenced(String str){
        Stack<Character>st=new Stack<>();

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('||str.charAt(i)=='{'||str.charAt(i)=='['){
                st.push(str.charAt(i));
            }else if(!st.isEmpty() && (str.charAt(i)==')' && st.peek()=='(')||(str.charAt(i)=='}' && st.peek()=='{')||
            (str.charAt(i)==']' && st.peek()=='[')){
                st.pop();
            }else{
                st.push(str.charAt(i));
            }
        }
        if(st.isEmpty())
        return true;
        else
        return false;
    }
    public static void main(String[] args) {
        String str="[{()}";
        boolean ans=isBalenced(str);
        System.out.println(ans);
    }
    
}
