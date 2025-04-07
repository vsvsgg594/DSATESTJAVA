public class BinarySearch {
    public static int binarySearch(int arr[], int k) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == k) {
                return mid; // 🎯 Found it! Get out.
            } else if (arr[mid] > k) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1; // 😢 Not found.
    }

    public static void main(String[] args) {
        int arr[] = {11, 12, 13, 14, 15, 16};
        int ans = binarySearch(arr, 15);

        if (ans != -1) {
            System.out.println("Found at index: " + ans);
        } else {
            System.out.println("Element not found.");
        }
    }
}
