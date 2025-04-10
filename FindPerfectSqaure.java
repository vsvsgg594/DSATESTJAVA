import java.util.*;
public class FindPerfectSqaure {
    public static int findPerfectSqaure(int n){
        for(int i=1;i<=n;i++){
            if(i*i==n){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int ans=findPerfectSqaure(25);
        System.out.println(":perfect sqaure "+ans);
        
    }
    
}
