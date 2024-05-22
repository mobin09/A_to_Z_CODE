import java.util.Arrays;

public class Str0005 {
    public static void main(String[] args){
      String address = "1.1.1.1";
      address = address.replace(".", "[.]");
      System.out.println(address);

      int[] arr = {6,4,2,1,0};
      Arrays.stream(arr).sorted().forEach(System.out::println);

    }
}
