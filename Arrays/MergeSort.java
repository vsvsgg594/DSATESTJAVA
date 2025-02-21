public class MergeSort {
    public static void conqure(int arr[], int si, int mid, int end) {
        int marged[] = new int[end - si + 1];
        int id1 = si;
        int id2 = mid + 1;
        int x = 0;
        while (id1 <= mid && id2 <= end) {
            if (arr[id1] <= arr[id2]) {
                marged[x++] = arr[id1++];
            } else {
                marged[x++] = arr[id2++];
            }
        }
        while (id1 <= mid) {
            marged[x++] = arr[id1++];
        }
        while (id2 <= end) {
            marged[x++] = arr[id2++];

        }

        for (int i = 0, j = si; i < marged.length; i++, j++) {
            arr[j] = marged[i];

        }
    }
    public static void merge(int arr[],int si,int end){
        if(si>=end){
            return;
        }
        int mid=si+(end-si)/2;
        merge(arr, si, mid);
        merge(arr, mid+1, end);

        conqure(arr, si, mid, end);
        

    }

    public static void main(String[] args) {
        int arr[]={38,27,43,10};
        merge(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}
