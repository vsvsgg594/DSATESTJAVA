package Basic;
public class Facto{
    public static int fact(int n){
        int fac=1;
        for(int i=1;i<n;i++){
            fac=fac*i;
        }
        return fac;
        
    }
    public static void main(String[] args) {
        int ans=fact(4);
        System.out.println(ans);
        
    }
}
