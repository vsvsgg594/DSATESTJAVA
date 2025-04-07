import java.util.Scanner;
import java.util.*;

public class StackCreation {
   private int arr[];
   private int size;
   private int top;
   public StackCreation(int size){
       this.size=size;
       this.arr=new int[size];
       this.top=-1;
   }
   public  void push(){
    Scanner sc=new Scanner(System.in);
    int a=0;
    do{
       if(top>arr.length){
        System.out.println("Stack is overflow situation");
       }else{
         System.out.println("enter data : ");
         int data=sc.nextInt();
         top=top+1;
         arr[top]=data;
       }

       System.out.println("do you want to add more data then press 1");
       a=sc.nextInt();
    }while(a==1);
   }
   public void display(){
    if(top<0){
        System.out.println("stack is not found data");
    }else{
        for(int i=top;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
   }
   public void   pop(){
    int d=0;
    Scanner sc=new Scanner(System.in);
    do{
        if(top<0 || top<=-1){
            System.out.println("stack is underflow situation");
        }else{
            top=top-1;
            System.out.println(arr[top]);
           

        }
        System.out.println("do you want to pop more items then press 1");
        d=sc.nextInt();


    }while(d==1);
   }
   public static void main(String[] args) {
    StackCreation s1=new StackCreation(10);
    s1.push();
    s1.display();
    s1.pop();
    s1.display();
   }
}
