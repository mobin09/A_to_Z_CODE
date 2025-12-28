import java.util.ArrayList;
public class Arr0014 {
    public static void main(String[] args){
        int[] arr = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> al = new ArrayList<>();
        int maxRight = arr[arr.length-1];
        al.add(maxRight);
        for(int i=arr.length -2; i>= 0; i--){
            if(arr[i] >= maxRight){
                al.add(arr[i]);
                maxRight = arr[i];
            }
        } 
       int start=0;
       int end = al.size() -1;
       while(start < end){
        Integer temp = al.get(start);
        al.set(start, al.get(end));
        al.set(end, temp);
        start++;
        end--; 
       }
      System.out.println(al);
    }
}
