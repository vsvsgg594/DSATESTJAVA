import java.util.*;
public class RotataRight {
    public static void rightRotation(int arr[]){
        int temp=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
    public static void main(String[] args) {
        int arr[]={5,6,7,8};
        rightRotation(arr);

        
    }
}
