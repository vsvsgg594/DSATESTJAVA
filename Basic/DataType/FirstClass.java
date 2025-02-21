import java.util.*;
public class FirstClass {
    int b;
    static int c;
    static{c=10;}
    public static void main(String[] args) {
        int a;//local  variable
        // System.out.println(a);// we cannot be use local veribale without initilazation it must be inilize first other wise its give error
        FirstClass f=new FirstClass();
        System.out.println(c);
        // System.out.println(f.b);// whe  we not inilize the instance veriable at declaration time then defual value should be hold by veribale   
    }
    
}
