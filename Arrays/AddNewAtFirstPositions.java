public class AddNewAtFirstPositions {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int newElement=6;
        int res[]=new int[arr.length+1];
        res[0]=newElement;
        for(int i=0;i<arr.length;i++){
            res[i+1]=arr[i];
        }
        System.out.println("------");
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }
}
