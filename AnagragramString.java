import java.util.*;
public class AnagragramString {
    public static boolean isAnagram(String str1,String str2){
        HashMap<Character,Integer> map=new HashMap<>();
        boolean ans=false;
        if(str1.length()!=str2.length()){
            return false;
        }
        for(int i=0;i<str1.length();i++)
        {
            if(map.containsKey(str1.charAt(i))){
                map.put(str1.charAt(i),map.get(str1.charAt(i))+1);
            }else{
                map.put(str1.charAt(i), 1);
            }
        }
        for(int i=0;i<str2.length();i++){
            if(map.containsKey(str2.charAt(i))){
                map.put(str2.charAt(i),map.get(str2.charAt(i))+1);
            }else{
                map.put(str2.charAt(i),1);
            }
        }
        for(int v:map.values()){
            if(v%2==0){
                ans=true;
            }
        }
        System.out.println();
        return ans;
    }
    public static void main(String[] args) {
        String str1="greesk";
        String str2="eeskg";
        boolean ans=isAnagram(str1, str2);
        System.out.println(ans);
    }
    
}
