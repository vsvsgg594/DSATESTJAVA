import java.util.*;
public class FindMaxFrequence {
    public static char getMaxOccurence(String str){
        HashMap<Character , Integer > map=new HashMap<>();
        char arr[]=str.toCharArray();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }

        int max = 0;
        char maxChar = '\0'; 

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        return maxChar;
      
        
    }
    public static void main(String[] args) {
        String str="vikashhs";
        char ans=getMaxOccurence(str);
        System.out.println(ans);
        
    }
    
}
