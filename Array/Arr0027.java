import java.util.Arrays;

public class Arr0027 {
    public static void sort(int[] arr, int low, int high){
        if(low < high){
            // find the middle point
            int mid = low + (high - low)/2;
            // sort the first half then second half
            sort(arr, low, mid);
            sort(arr, mid+1, high);
            merge(arr, low, mid, high);
        }
    }
public static void merge(int[] arr, int low, int mid, int high){
     // Merges two subarrays of arr[].
     // First subarray is arr[l..m]
     // Second subarray is arr[m+1..r]

     // Find sizes of two subarrays to be merged
    int n1 = mid -low +1;
    int n2 = high -mid;
    // Create temp arrays
    int[] L = new int[n1];
    int[] R = new int[n2];
    // Copy data to temp arrays
    for(int i=0; i<n1; i++){
        L[i] = arr[i + low];
    }
    for(int j = 0; j<n2; j++){
        R[j] = arr[j + mid + 1];
    }
    // Merge the temp arrays

    // Initial indices of first and second subarrays
        int i = 0, j = 0;
     // Initial index of merged subarray array
        int k = low;
     while(i < n1 && j < n2){
        if(L[i] < R[j]){
            arr[k] = L[i];
            i++;
        }else{
            arr[k] = R[j];
            j++;
        }
        k++;
     }
// Copy remaining elements of L[] if any
while(i < n1){
    arr[k] = L[i];
    i++;
    k++;
}
// Copy remaining elements of R[] if any

 while(j < n2){
    arr[k] = R[j];
    j++;
    k++;
  }  
}
    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        int low = 0;
        int high = arr.length -1;
        sort(arr, low, high);
        System.out.println(Arrays.toString(arr));
    }
}
