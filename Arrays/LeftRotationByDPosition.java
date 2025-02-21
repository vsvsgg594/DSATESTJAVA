public class LeftRotationByDPosition {
    public static void leftRotationByK(int arr[], int k) {
        int n = arr.length;
        k = k % n; // Handle cases where k > n
        int[] temp = new int[k];
        
        // Copy first k elements to temp
        // 1 2 3 4 5 6 7 8
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];//1 2
        }

        // Shift the rest of the array to the left
        // 1 2 3 4 5 6 7 8 
        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }

        // Copy elements from temp back to the array
        for (int i = 0; i < k; i++) {
            arr[n - k + i] = temp[i];
        }

        // Print the rotated array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 2;
        leftRotationByK(arr, k);
    }
}
