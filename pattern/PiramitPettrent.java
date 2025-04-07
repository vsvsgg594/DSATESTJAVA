import java.util.Scanner;

public class PiramitPettrent {
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
    System.out.println("enter rows");
    int r=sc.nextInt();
    System.out.println("enter col :");
    int c=sc.nextInt();
    for(int i=0;i<r;i++){
        for(int j=1;j<=c;j++){
            
            if(j<=2*i+1){
                System.out.print("*");
            }
          
        }
        System.out.println("");
    }
        
    }
}
