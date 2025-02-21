import java.util.HashMap;

public class FindDuplicate {
    public static void findDuplicate(int arr[],int n)
    {
        if(arr.length==0 || arr.length==1){
            return ;
        }
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else
            {
                map.put(arr[i],1);
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(map.get(arr[i])>1){
                System.out.println("Duplicate element is "+arr[i]);
            }
        }
       


    }
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6,7,8,9,1};
        int n=arr.length;
        findDuplicate(arr,n);
        
    }
}
