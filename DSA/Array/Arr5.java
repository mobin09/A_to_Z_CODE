public class Arr5 {
    static int binarySearch(int[] arr, int low, int high, int data){
        if(low <= high){
            int mid = low + (high -low)/2; // prevent integer overflow
            if(arr[mid] == data){
                return mid;
            }else if(data < arr[mid]){
                return binarySearch(arr, low, mid, data);
            }
            return binarySearch(arr, mid+1, high, data);
        }else{            
        return -1;
        }
    }
    public static void main(String[] args) {
        int arr[] = { 5, 6, 7, 8, 9, 10 }; 
        int low = 0;
        int high = arr.length -1;
        int key = 10; 
        int i = binarySearch(arr, low, high, key);
        System.out.println(i);
    }
}
