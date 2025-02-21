package Basic.BreakandContinu;

public class BreakExmple {
    public static void main(String[] args) {
        int count=0;
       
        for(int i=0;i<=10;i++){
            count++;

           
            
            if(i==5){
                System.out.println(count);

                break;
            }
            System.out.println(i);
        }
        
    }
}
