public class InilizationOfArrays{
    public static void main(String[] args) {
       // Inilization of Arrays
       int arr[]={1,2,3,4,5};
       for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
       }
       int newElement=6;
       int res[]=new int[arr.length+1];

       for(int i=0;i<arr.length;i++){
        res[i]=arr[i];
       }
       res[arr.length]=newElement;
       System.out.println("------");
       for(int i=0;i<res.length;i++){
        System.out.println(res[i]);
       }
    }
}