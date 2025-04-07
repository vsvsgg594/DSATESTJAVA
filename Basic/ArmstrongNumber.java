import java.util.Scanner;
public class ArmstrongNumber {
    public static boolean isArmStrongNumber(int num) {
        int originalNumber = num;
        int count = 0;
        int sum = 0;
        int temp = num;

       
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, count); 
            temp = temp / 10;
        }

        return originalNumber == sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        sc.close();  

        boolean ans = isArmStrongNumber(num);
        System.out.println(num + " is " + (ans ? "an Armstrong number." : "not an Armstrong number."));
    }
}
