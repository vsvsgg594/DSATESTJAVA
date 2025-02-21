public class RightRotation {
    public static void rightRotation(int arr[],int n){
        int temp=arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5,6,7,8};
        int n = arr.length;
        rightRotation(arr, n);
       
    }
}
