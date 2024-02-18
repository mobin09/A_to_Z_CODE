
public class LowestValue {
    public static void main(String[] args){
        int[] arr = { 7,12,9,11,3 };
        int lowest = arr[0];
        for(int data : arr){
            if(data < lowest){
                lowest = data;
            }
        }

        System.out.println(lowest);

    }    
}
