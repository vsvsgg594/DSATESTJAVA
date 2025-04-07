import java.util.*;
public class ConvertDecimalTOBinary {
    public static String convertDecimalToBinary(int num){
        StringBuffer st=new StringBuffer();
        if(num==0) return "0";
        while(num>0){
            st.append(num%2);
            num=num/2;

        }
        return st.toString();
    }
    public static void main(String[] args) {
        String str=convertDecimalToBinary(9);
        System.out.println();
        System.out.println(str);
        
    }
}
