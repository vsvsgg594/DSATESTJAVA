import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class FindDuplicateByList {
    public static ArrayList<Integer> findDuplicateItems(int arr[],int n)
    {
        ArrayList<Integer> list = new ArrayList<>();

        Map<Integer,Integer> map=new HashMap<>();

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
            if(map.get(arr[i])>1)
            {
                list.add(arr[i]);
            }
        }
        return list;

    }
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5,6,7,8,9,1};
        ArrayList<Integer> list = findDuplicateItems(arr,arr.length);
        System.out.println(list);
        
    }
}
