import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;
public class Str0014 {
    public static void main(String[] args) {
        String[] arr = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        long lst = Arrays.stream(arr)
                    .map(s -> s.substring(s.length()-4, s.length()-2))
                    .filter(x -> Integer.parseInt(x) > 60)
                    .count();
                    
        System.out.println(lst);
    }
}
