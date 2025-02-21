public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70,80,90,100};
        int target=30;
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                System.out.println("Element found at index "+mid);
                break;
        }else if(arr[mid]<target){
            low=mid+1;
        }else{
            high=mid-1;
        }

    }
  }
}
