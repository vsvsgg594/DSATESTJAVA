public class FindMin {
    public static int findMin(int arr[],int n)
    {
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min){
                min=arr[i];

            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[]={10,5,30,15,50,6};
        int min=findMin(arr,6);
        System.out.println("Min element is "+min);
    }
}
