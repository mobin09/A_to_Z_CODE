public class Arr1 {
    static int findElement(int[] arr, int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
       return -1; 
    }
     public static void main(String[] args){
        int arr[] = { 12, 34, 10, 6, 40 };
        int key = 40;
        int index = findElement(arr, key);
        System.out.println(index);
     }
}
