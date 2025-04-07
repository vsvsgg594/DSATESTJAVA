package Basic;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CheckTwoNumberIsAnagram {
    public static boolean isAnagram(int num1,int num2){
        String str1=Integer.toString(num1);
        String str2=Integer.toString(num2);
        if(str1.length()!=str2.length()){
            return false;
        }
        char arr1[]=str1.toCharArray();
        char arr2[]=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }
    public static void main(String[] args) {
        boolean ans=isAnagram(1234,4321);
        System.out.println(ans);
        
    }
}
