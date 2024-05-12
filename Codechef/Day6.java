// https://www.codechef.com/practice/course/arrays/ARRAYS/problems/LARGESECOND
public class Day6{
    public static void main(String[] args){
        int[] arr = {4,1,6};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int i=0;
        System.out.println("Initially first and second is:::" + first + " " + second);
        while(i < arr.length){
            if(arr[i] > first){
                first = arr[i];
            }
            i++;
        }
        
        System.out.println("Final First is:::" + first);
        int j = 0;
        while(j < arr.length){
           // System.out.println(arr[j] + "value");
            if(second < arr[j] && arr[j] != first){
                //System.out.println("Second " + second);
                second = arr[j];
            }
            j++;
        }

        System.out.println(first + " " + second);


    }
}