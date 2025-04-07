package Basic;

public class PowerOfN {
    public static void powerOfN(int x,int n){
        int result=1;
        for(int i=0;i<n;i++){// i=0 result=1*2=2
            result=result*x;//i=1 result=2*2=4
                             //i =2 result=4*2=8
                             // i=3 result=8*2=16
                             //i=4 reslut=16*2=32
                             
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        int x=2,n=5;//out put ans=32
        powerOfN(x, n);
    }
}
