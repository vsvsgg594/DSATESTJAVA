import java.util.*;
public class CheckPalidromNumber {
    public static boolean isPalidrom(int num){
        int original=num;
        int reverse=0;
        while(num!=0){
            int remainder=num%10;
            reverse=reverse*10+remainder;
            num=num/10;
        }
        System.out.println(reverse);
        if(original==reverse)
        return true;
        else 
        return false;
    }
    
    public static void main(String[] args) {
        System.out.println();
        boolean ans=isPalidrom(123321);
        System.out.println();
        System.out.println(ans);
        
    }
}
