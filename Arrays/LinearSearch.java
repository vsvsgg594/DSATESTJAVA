public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={10,20,30,45,12,40};
        int target=40;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("Element found at index "+i);
                break;
            }
        }
    }
}
