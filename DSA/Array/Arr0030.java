import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;

public class Arr0030 {
    public static void main(String[] args) {
        String[] ch = {"d", "e", "m", "a","c", "x", "b", "d"};
        List<String> retArr = Arrays.stream(ch).sorted((x,y)-> x.compareTo(y)).collect(Collectors.toList());
        //System.out.println(retArr);


        char[] chArr = {'d', 'e', 'm', 'a', 'c', 'x', 'b', 'd'};
        
        for(int i=0; i<chArr.length-1; i++){
             for(int j=1+i; j<chArr.length; j++){
                if(chArr[i] > chArr[j]){
                    // swap logic
                    char temp = chArr[i];
                    chArr[i] = chArr[j];
                    chArr[j] = temp; 
                }
             }
        }

        //System.out.println(Arrays.toString(chArr));
     
        // form the greatest number 
        ArrayList<String> list = new ArrayList<>();
        list.add("54");
        list.add("546");
        list.add("548");
        list.add("60");
        
       String z = ""; 
       String ls =  list.stream().sorted((x,y)-> -(x+y).compareTo(y+x)).reduce(z, (a,b) -> a+b);
       System.out.println(ls);
    }
}
