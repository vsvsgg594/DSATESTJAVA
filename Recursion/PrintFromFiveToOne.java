public class PrintFromFiveToOne {
    public void printValue(int n){
        if(n==0)
        return;
        printValue(n-1); 
        System.out.println(n);
    }
    public static void main(String[] args) {
        PrintFromFiveToOne p=new PrintFromFiveToOne();   
        p.printValue(10);

        
    }
}
