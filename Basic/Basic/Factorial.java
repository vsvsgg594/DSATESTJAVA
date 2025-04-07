package Basic;

public class Factorial {
    public static void main(String[] args) {
        int n=5;
        int fac=1;
        for(int i=5;i>0;i--){
            fac=fac*i;
        }
        System.out.println("factorial "+fac);
    }
}
