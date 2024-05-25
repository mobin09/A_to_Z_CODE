import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;

public class Str0012 {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        String[] arr = s.split(" ");
        String lst = Arrays.stream(arr)
        .sorted(
            (x, y)-> x.substring(x.length()-1, x.length()).compareTo(y.substring(y.length()-1, y.length())))
            .map(wrd -> wrd.replace(wrd.substring(wrd.length()-1), "")).collect(Collectors.joining(" "));
        System.out.println(String.valueOf(lst));
    }
}
