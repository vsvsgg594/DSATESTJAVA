public class AddAnyPosition {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int newElement=6;
        int position=2;
        int res[]=new int[arr.length+1];
        for(int  i=0;i<arr.length+1;i++){
            if(i<position){
                res[i]=arr[i];
            }else if(i==position){
                res[i]=newElement;

            }else{
                res[i]=arr[i-1];
            }
        }
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }
}
