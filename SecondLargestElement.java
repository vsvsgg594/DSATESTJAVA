import java.util.*;
public class SecondLargestElement {
    public static void findSecondLargestElement(int arr[]){
        int a=0;
        int b=0;
        if(arr[0]>arr[1]){
            a=arr[0];
            b=arr[1];
        }else{
            b=arr[0];
            a=arr[1];
        }
        for(int i=2;i<arr.length-1;i++){
            if(arr[i]>a){
                b=a;
                a=arr[i];
            }else if(arr[i]<a && arr[i]>b){
                b=arr[i];
            }
        }
        System.out.println();
        System.out.print("second largest element " + b);
        
    }
    public static void main(String[] args) {
        int arr[]={20,40,55,35,47,90,30};
        findSecondLargestElement(arr);
        
    }
    
}
