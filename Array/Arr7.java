import java.util.Arrays;
public class Arr7 {
    static int findElement(int[] arr, int low, int high, int data){
        if(low <= high){
            int mid = low + (high -low)/2;
            if(arr[mid]  == data){
                return mid;
            } else if(arr[mid] > data){
                return findElement(arr, low, mid, data);
            }
          return findElement(arr, mid+1, high, data);
        }
        return -1;
    }
    static int deleteElement(int[] arr, int pos){
        int i;
        for(i = pos; i < arr.length -1; i++){
             arr[i] = arr[i+1];
        }
        return i;
    }
    public static void main(String[] args) { 
        int arr[] = { 10, 20, 30, 40, 50 }; 
        int n = arr.length; 
        int key = 30; 
        // first search the elements and then delete
        int low = 0;
        int high = n-1;
        int indexOfElement = findElement(arr, low, high, key);
        System.out.println(indexOfElement);    
        if(indexOfElement != -1){
            deleteElement(arr, indexOfElement);
            System.out.println(Arrays.toString(arr));
        }    
    }
}
