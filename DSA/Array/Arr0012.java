import java.util.ArrayList;
import java.util.List;

public class Arr0012 {
    public static void main(String[] args) {
        String[] words = {"abc","bcd","aaaa","cbc"};
        List<Integer> list = new ArrayList<>();
        char ch = 'z';
        for(int i=0; i<words.length; i++ ){
            String wrds = words[i];
            if(wrds.contains(ch+"")){
                list.add(i);
            }
        }

        System.out.println(list);


    }
}
