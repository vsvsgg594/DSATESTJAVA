public class PrintOneToFive {
    public void printValue(int n){
        if(n>5){
            return;
        }
        System.out.println(n);
        printValue(n+1);


    }
    public static void main(String[] args) {
        PrintOneToFive p=new PrintOneToFive();
        p.printValue(1);
        
    }
}
