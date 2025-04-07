public class SumOfDigitByRecursion {
    public static int findSum(int num){
        int sum=0;
        if(num==0){
            return 0;
        }
        sum =findSum(num/10)+num%10;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println();
        int ans=findSum(456);
        System.out.println(ans);
        
    }
}
