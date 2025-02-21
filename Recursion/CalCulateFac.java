public class CalCulateFac {
    public static int fac(int n){
        if(n==0 || n==1){
            return 1;
        }
        int ans=1;
        ans=n*fac(n-1);
        return ans;
    }
    public static void main(String[] args) {
        int ans=fac(4);
        System.out.println();
        System.out.println(ans);
    }
}
