package Basic;

public class CountPrimeNumber {
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
    public static int numberOfPrimeNumber(int n){
        int count=0;
        for(int i=2;i<=n;i++){
            if(isPrimeNumber(i)){
                count++;
            }
        }
        return count;
    }
       public static void main(String[] args) {
        int ans=numberOfPrimeNumber(10);
        System.out.println();
        System.out.println("ans"+ans);
    }
}
