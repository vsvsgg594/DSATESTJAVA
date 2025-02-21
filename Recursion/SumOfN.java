public class SumOfN {
    public static void sumOfNNumber(int i,int n,int sum){
        if(i==n){
            sum=sum+n;
            System.out.println(sum);
            return;
        }
        sum=sum+i;
        sumOfNNumber(i+1, n, sum);
        System.out.println(i);
    }
    public static void main(String[] args) {
        sumOfNNumber(1, 5, 0);
        
    }
}
