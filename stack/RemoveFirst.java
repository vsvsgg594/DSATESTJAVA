import java.util.*;
import java.util.Stack;
public class RemoveFirst {
    public static void remove(String str1, String str2) {
        Stack<Character> st = new Stack<>();

       
        for (int i = 0; i < str1.length(); i++) {
            st.push(str1.charAt(i));
        }

       
        StringBuilder result = new StringBuilder();

       
        while (!st.isEmpty()) {
            char currentChar = st.pop();
            
            
            if (str2.indexOf(currentChar) == -1) {
                result.append(currentChar);
            } else {
                
                str2 = str2.replaceFirst(String.valueOf(currentChar), "");
            }
        }

       
        System.out.println(result.reverse().toString());
    }

    public static void main(String[] args) {
        remove("computer", "cat"); // Expected output: "ompuer"
    }
}
