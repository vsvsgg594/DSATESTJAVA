public class SecondLaegestNumber {
    public static int findSecondLargestNumber(int arr[],int n)
    {
        int m1=0;
        int m2=0;
        if(arr.length<=1)
        {
            return -1;
        }
        if(arr[0]>arr[1])
        {
            m1=arr[0];
            m2=arr[1];

        }else{
            m1=arr[1];
            m2=arr[0];
        }
        for(int i=2;i<arr.length;i++)
        {
            if(arr[i]>m1)
            {
                m2=m1;
                m1=arr[i];
            }
            else
            {
                if(arr[i]>m2)
                {
                    m2=arr[i];
                }

            }
        }
        return m2;
        
    }
    public static void main(String[] args) 
    {
        int arr[]={10, 20, 30, 40, 50};
        int n=arr.length;
        System.out.println("Second largest number is "+findSecondLargestNumber(arr,n));
    }
    
}
