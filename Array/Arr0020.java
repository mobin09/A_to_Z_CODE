import java.util.HashSet;
public class Arr0020 {
    public static void main(String[] args){
        int A[] = { 1, 4, 45, 6, 10, 8 };
        int target = 16;
        HashSet<Integer> hset = new HashSet<>();
        for(int i=0; i<A.length; i++){
            int temp = target - A[i];
            if(hset.contains(temp)){
                System.out.println("Yes");
                return;
            }
            hset.add(A[i]); 
        }
        System.out.println("No");
    }
}
