package Operater;

public class isCheckPrimeNumber {
    public static boolean isCheckPrimeNumber(int num){
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
   

    public static void main(String[] args) {
        boolean ans=isCheckPrimeNumber(4);
        System.out.println(ans);

        
    }
}
