import java.util.*;
public class Stack{
   int size=100;
   int top=-1;
   int arr[]=new int[size];
   public void pushData(){
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter size of stack :");
    int newSize=sc.nextInt();
    arr=new int[newSize];
    do{
        if(top>=arr.length){
            System.out.println("Stack overFlow");
        }else{
          
            System.out.println("Enter the data");
            n=sc.nextInt();
            top++;
            arr[top]=n;
            System.out.println("Data pushed");
        }
        System.out.println("do you want to push more data press 1");
        n=sc.nextInt();

    }while(n==1);
   }
   public static void main(String[] args) {
    Stack s1=new Stack();
    s1.pushData();
   }


}