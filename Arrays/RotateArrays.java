import java.util.*;
public class RotateArrays{
    public static void rotateArrays(int arr[],int d){
        int n=arr.length;
        int k=n%d;
        int temp[]=new int[k];
        for(int i=0;i<k;i++){
            temp[i]=-arr[i];
        }
        for(int i=d;i<n;i++){
            arr[i-d]=arr[i];
        }
        int j=0;
        for(int i=n-d;i<n;i++){
            arr[i]=temp[j++];
            

        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int d=2;
        rotateArrays(arr,d);
        
    }

}