import java.util.*;
public class PermutationOfString {
    public static void swap(char arr[],int i,int fixedIndex){
        char temp = arr[i];
        arr[i] = arr[fixedIndex];  // Correct swap logic
        arr[fixedIndex] = temp;
    }
    public static void printPermutationOfString(char arr[],int fixedIndex){
       
        if(fixedIndex==arr.length-1){
            System.out.println(arr);
            return;
        }
        for(int i=fixedIndex;i<arr.length;i++){
            swap(arr,i,fixedIndex);
            printPermutationOfString(arr, fixedIndex+1);
            swap(arr,i,fixedIndex);
        }
    }
    public static void main(String[] args) {
        String str="ABC";
        char arr[]=str.toCharArray();
        printPermutationOfString(arr, 0);
        
    }
    
}
