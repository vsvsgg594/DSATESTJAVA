package Basic;

import java.util.HashMap;
import java.util.Map;

public class TwoNumberAnagram {
    public static boolean checkANAGRAM(int num1,int num2){
        String str1=Integer.toString(num1);
        String str2=Integer.toString(num2);
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str1.length();i++){
            if(map.containsKey(str1.charAt(i))){
                map.put(str1.charAt(i), map.get(str1.charAt(i))+1);
            }else{
                map.put(str1.charAt(i),1);
            }
        }
        for(int i=0;i<str2.length();i++){
            if(map.containsKey(str2.charAt(i))){
                map.put(str2.charAt(i), map.get(str2.charAt(i))+1);
            }else{
                map.put(str2.charAt(i),1);
            }
        }
        for(Integer i:map.values()){
            if(i%2!=0){
                return false;

            }
        }
        return true;


    }
    public static void main(String[] args) {
        boolean ans=checkANAGRAM(1234, 4231);
        System.out.println("ans"+"is"+ans);
    }
}
