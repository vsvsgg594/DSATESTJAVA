import java.util.Scanner;

public class QueueImple{
    int size;
    int arr[];
    int front=-1;
    int rare=-1;
    QueueImple(int size){
        this.size=size;
        arr=new int[size];
    }
    public void enqueue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data:");
        int data = sc.nextInt();
        int n;
    
        do {
            if (front == -1 && rare == -1) {
                front = rare = 0; // Inserting the first element
                arr[rare] = data;
            } else if (rare == arr.length - 1) {
                System.out.println("Queue is full");
            } else {
                rare++;  // Increment rear for the next element
                arr[rare] = data;
            }
    
            System.out.println("Do you want to insert more data? Press 1");
            n = sc.nextInt();
            if (n == 1) {
                System.out.println("Enter next data:");
                data = sc.nextInt();
            }
    
        } while (n == 1);
    }
    public void dequeue(){
        if(front==-1 && rare==-1){
            System.out.println("empty queue");
        }else if(front==rare){
            front=rare=-1;
        }else{
            front++;
        }

    }
    public void display(){
        if(front==-1 && rare==-1){
            System.out.println("empty queue");

        }else{
            for(int i=front;i<=rare;i++){
                System.out.println(arr[i]);
            }
        }


    }
    public boolean isEmpty(){
        if(front==-1 && rare==-1){
            return true;
        }else{
            return false;
        }
    }
    public boolean isFull(){
        if(front==arr.length-1){
            return true;
        }else{
            return false;
        }
    }
    public void peek(){
        if(isEmpty()){
            System.out.println("empty queue");
        }
        System.out.println(arr[front]);
    }
    public static void main(String[] args) {
        QueueImple q=new QueueImple(5);
        q.enqueue();
        q.peek();
        q.display();
        q.dequeue();
        System.out.println("----------------------");
        q.display();
        q.peek();
    }
}