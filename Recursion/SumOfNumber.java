public class SumOfNumber {
    public int sumOfNumber(int n){
      
        if(n==0){
            return 0;
        }
        return n+sumOfNumber(n-1);
   
    }
    public static void main(String[] args) {
        SumOfNumber s1=new SumOfNumber();
        int ans=s1.sumOfNumber(10);
        System.out.println();
        System.out.println(ans);
    }
}
