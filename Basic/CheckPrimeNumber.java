import java.util.Scanner;
public class CheckPrimeNumber {
    public static boolean isPrimeNumber(int num){
        int count=0;
        if(num<2){
            return false;
        }
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        boolean ans=isPrimeNumber(3);
        System.out.println();
        System.out.println(ans);
        
    }
}
