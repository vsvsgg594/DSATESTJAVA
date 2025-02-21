public class CalculateFactorial {
    public static int calculateFact(int n){
        if(n==1 || n==0){
            return 1;
        }
        int fact_n=calculateFact(n-1);
        int ans=n*fact_n;
        return ans;
    }
    public static void main(String[] args) {
        int ans =calculateFact(5);
        System.out.println(ans);
        
    }
}
