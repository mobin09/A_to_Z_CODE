public class Arr0029 {

    public static  int findElement(int[] arr, int low, int high, int key){
        while(low < high){
         int mid = low + (high -low) /2;
         if(arr[mid] == key){
             return mid;
         }else if(key < arr[mid]){
             high = mid -1;
         }else{
             low = mid+1;
         }
        }
        return -1;
    }
 

    public static void main(String[] args) {
       int[] nums2 =  {4, 4, 8, 9, 9};
       int key = 4;

       int x = findElement(nums2, 0, nums2.length -1, key);
       System.out.println(x);
    }
}
