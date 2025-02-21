public class FindMax {
    public static int findMax(int arr[],int n)
    {
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;

    }
    public static void main(String[] args) {
        int arr[]={10,5,30,15,50,6};
        int max=findMax(arr,6);
        System.out.println("Max element is "+max);
    }
}
