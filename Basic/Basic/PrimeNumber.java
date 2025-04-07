package Basic;

public class PrimeNumber{
    public static void main(String[] args) {
        int n=4;
        int count=0;
        if(n<0 || n<1 ){
            System.out.println("no prime number !");
        }
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }

        }
        if(count==2){
            System.out.println("prime number");
        }else{
            System.out.println("not prime number");
        }
    }
}