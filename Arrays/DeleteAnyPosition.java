public class DeleteAnyPosition {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int res[]=new int[arr.length-1];
        int p=2;
        for(int i=0;i<arr.length;i++){
            if(i<p){
                res[i]=arr[i];
            }else if(i==p){
                continue;
            }else{
                res[i-1]=arr[i];
            }
         
        }
        for(int i=0;i<res.length;i++)
        {
            System.out.println(res[i]);
         
        }
    }
}
