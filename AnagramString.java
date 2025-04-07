import java.util.*;
public class AnagramString {
    public static boolean isAnagram(String str1,String str2){
        char arr1[]=str1.toCharArray();//o(n)
        char arr2[]=str2.toCharArray();//o(n)
       
        if(arr1.length!=arr2.length){
            return false;
        }
        Arrays.sort(arr1);//0 nlogn
        Arrays.sort(arr2);// 0(nlogn)
        for(int i=0;i<arr1.length;i++){ // o(n)
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
       
        return true;
        // Total Time complexity nlong and space complixity will  be o(n)
    }
    public static void main(String[] args) {
        String str1="geeks";
        String str2="kseeg";


        
        boolean ans=isAnagram(str1, str2);
        System.out.println(ans);
    }
    
}
