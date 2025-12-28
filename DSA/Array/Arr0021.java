public class Arr0021 {
        public static void main(String[] args){
        int[] arr = {1,13};
        int maxCount = 0; 
        int index  = -1;
        for(int i=0; i<arr.length; i++ ){
           int first = arr[i];
           int count =0;
           for(int j=0; j < arr.length; j++){
            if(first == arr[j]){
                count++;
            }
           }
           if(maxCount < count){
            maxCount = count;
            index = i;
           }
        }
        if(maxCount > arr.length /2){
            System.out.println(arr[index]);
        }else{
            System.out.println(-1);
        }
    }
}
