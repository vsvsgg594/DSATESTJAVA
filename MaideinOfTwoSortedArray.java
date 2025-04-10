import java.util.*;
public class MaideinOfTwoSortedArray {
    public static void medianOfTwoSoretedArray(int arr1[],int arr2[]){
        int i=0;int j=0;int k=0;
        int mergeArray[]=new int[arr1.length+arr2.length];
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                mergeArray[k]=arr1[i];
                i++;
                k++;
            }else{
                mergeArray[k]=arr2[j];
                j++;
                k++;
            }
        }
        while (i<arr1.length) {
            mergeArray[k++]=arr1[i++];
            
        }
        while (j<arr2.length) {
            mergeArray[k++]=arr2[j++];
            
        }
        int count=0;
        for(int i1=0;i1<mergeArray.length;i1++){
            count++;
            System.out.println(mergeArray[i1]);

        }
        int n = mergeArray.length;
        if (n % 2 == 0) {
            double median = (mergeArray[n / 2] + mergeArray[n / 2 - 1]) / 2.0;
            System.out.println("Median: " + median);
        } else {
            System.out.println("Median: " + mergeArray[n / 2]);
        }
    }
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,6};
        int arr2[]={7,8,9};
        medianOfTwoSoretedArray(arr1, arr2);
        
    }
    
}
