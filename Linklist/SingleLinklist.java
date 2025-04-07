import java.util.*;
import java.util.Scanner;

public class SingleLinklist {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public void createNode(){
        Scanner sc=new Scanner(System.in);
        int d,c;
        do{
            System.out.println("enter data :");
            int data=sc.nextInt();
       
          Node new_node=new Node(data);
        if(head==null){
            head=new_node;

        }else{
            System.out.println("enter your choice :press 1 :starting 2:ending 3:at anywhere ");
            c=sc.nextInt();
            switch(c){
                case 1:Node temp=head;
                       new_node.next=temp;
                       temp=new_node;
                       break;
                case 2:Node temp2=head;   
                       while(temp2.next!=null){
                        temp2=temp2.next;
                       }    
                       temp2.next=new_node;
                       break;
                       
                        

            }
        }
        System.out.println("do you want to add more node then press 1");
        d=sc.nextInt();
        }while(d==1);
    }

    public void displayList() {
        Node temp = head;
        if (head == null) {
            System.out.println("no data");
        } else {
            while (temp != null) {
                
                System.out.println(temp.data);
                temp=temp.next;

            }
        }
    }
    public static void main(String[] args) {
        SingleLinklist s1=new SingleLinklist();
        s1.createNode();
        s1.displayList();
    }
}