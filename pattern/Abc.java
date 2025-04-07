import java.util.*;
import java.util.Scanner;
public class Abc{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row");
        int r=sc.nextInt();
        System.out.println("enter col ");
        int c=sc.nextInt();
        for(int i=1;i<=r;i++){
            int ch=65;
            for(int j=i;j<=r;j++){
                System.out.print((char)(ch-1+j));
            }
            System.out.println("");

        }
    }
}