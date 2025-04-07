import java.util.*;
import java.util.Scanner;
public class NumberPettern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter rows");
        int r=sc.nextInt();
        System.out.println("enter col :");
        int c=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
        
    }
}
