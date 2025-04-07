import java.util.*;
public class ReverseMatrix {
    public static void reverseMatrix(int arr[][]){
        int n=arr.length-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=arr[j][i];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println(arr[i][j]);
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        reverseMatrix(matrix);
        
    }
    
}
