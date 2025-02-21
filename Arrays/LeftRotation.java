public class LeftRotation{
    public static void leftRotation(int arr[],int n){
        int temp=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=temp;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={5,6,7,8,2};
        int n=arr.length;
        leftRotation(arr, n);
    }
}