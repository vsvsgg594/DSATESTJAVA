package Basic.BreakandContinu;

public class BreakExmple2 {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            for(int j=1;j<10;j++){
                if(i==2 && j==3){
                    break;
                }
                System.out.println(i+" and "+ j);


            }
            System.out.println("outer loop "+i);
        }
    }
}
