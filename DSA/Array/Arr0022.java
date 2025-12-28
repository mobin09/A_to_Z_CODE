public class Arr0022 {
    public static void main(String[] args) {
        // find majority element using the moore-alogrithms
        int[] arr = {6 ,1 ,15 ,19 ,9 ,13, 12, 6, 7, 2 ,10 ,4 ,1 ,14 ,11 ,14 ,14 ,13};
        int count = 0;
        int candidate = -1;
        for(int i=0; i<arr.length; i++){
            if(count ==0){
                candidate = arr[i];
                count = 1;
            }else{
                if(arr[i] == candidate){
                    count++;
                }else{
                    count--;
                }
            }
        }
        count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == candidate){
                count++;
            }
        }
        if(count > arr.length / 2){
            System.out.println(candidate);
        }else{
            System.out.println(-1);
        }
    }
}
