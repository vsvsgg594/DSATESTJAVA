package Basic.Operater;

public class UniaryOperator {
    public static void main(String[] args) {
//         Unary Operators
// Unary Operators need only one operand. They are used to increment, decrement, or negate a value. 

// - , Negates the value.
// + , Indicates a positive value (automatically converts byte, char, or short to int).
// ++ , Increments by 1.
// Post-Increment: Uses value first, then increments.
// Pre-Increment: Increments first, then uses value.
// -- , Decrements by 1.
// Post-Decrement: Uses value first, then decrements.
// Pre-Decrement: Decrements first, then uses value.
// ! , Inverts a boolean value.
    //  int a=10;
    //  System.out.println(++a);
    //  System.out.println(a++);
    //  System.out.println(a);
    //  System.out.println(++10);
    // int a=5,b=6,c=7;
    // int exp = a + b++ + ++c; 
    // System.out.println("exp = " +exp); //19
    // System.out.println("b"+b);
    // System.out.println("c"+c);
    // int a, b, c;
    // a = b = c = 5;
    // int exp = a + b++ + ++c; 
    // System.out.println("exp = " +exp);
    // int a,b,exp=10;
    // a=b=5;
    // exp += ++a * b++;//exp=10+5*5
    // System.out.println(exp);
    // int a, b, exp = 10;
    // a = b = 5;
    // exp *= ++a * 10 / b++ + --a;//epx=10*6*10/5+5==>10*6*2+5
    // System.out.println(exp);
    
    //  int x = 5, y = 2, exp = 10;
    //  exp %= x + ( x > 6 ? ++y : --y);//5+(5>6?++2:--2)==>5+1==10%6
    //  System.out.println("exp = " +exp);
//     int a = 4;	
//    int x = a >= 5 ? 1+2 : 1*1;//4>=5?1+2:1*1==1
  
//    if(++x < 4)//2<4
// 	  x += 1;//x=x+1==>2+1==3
//        System.out.println("Value of x: " +x);
//     int x = 6;
//     long y = 3;
//     if(x % 3 >= 1)
//      y++;
//      y--;
//    System.out.print("Value of y: " +y);
   int x = 10 * (2 + (1 + 2 / 5));//10*(2+(1+2/5))
   int y = x * 2;
   System.out.print(x + y < 10 ? "Hello" : "Java");

    }
}
