public class SumOfOneToN {
    public static int sumOfNumber(int n){
        if(n==0){
            return 0;
        }
        if(n>10){
            return 0;
        }
        return n+sumOfNumber(n+1);

    }
    public static void main(String[] args) {
        int asn=sumOfNumber(1);
        System.out.println();
        System.out.println(asn);

        
    }
}
