package Operater;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ListOfPrimeNumber {
   public static boolean isPrimeNumber(int num){
    if(num<2){
        return false;
    }
    for(int i=2;i*i<=num;i++){
        if(num%i==0){
            return false;
        }
    }
    return true;
   }
   public static void findListOfPrimeNumber(int start,int end){
    ArrayList<Integer> list=new ArrayList<>();
    for(int i=start;i<=end;i++){
        if(isPrimeNumber(i)){
            list.add(i);

        }
    }
    Collections.sort(list);
    for(int i=0;i<list.size();i++){
        System.out.println(list.get(i));
    }



   }
    public static void main(String[] args) {
        System.out.println();
        findListOfPrimeNumber(1, 20);
        
    }
    
}
