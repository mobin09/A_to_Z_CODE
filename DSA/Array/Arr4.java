import java.util.Arrays;
public class Arr4 {
    static int findTheElement(int[] arr, int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
     static void deleteElement(int[] arr,int key){
        int pos =  findTheElement(arr, key);
        if(pos == -1){
            System.out.println("Element is Not present");
            return;
        }
        for(int i=pos; i< arr.length -1; i++){
            arr[i] = arr[i+1];
        }
    }
    public static void main(String[] args){
        int arr[] = { 10, 50, 30, 40, 20 };
        int n = arr.length;
        int key = 30;
        deleteElement(arr, key);
        System.out.println(Arrays.toString(arr));
    }
}
