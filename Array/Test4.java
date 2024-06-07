import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {
        String str = "12345678910jqp";
        StringBuilder sb = new StringBuilder(str).reverse();
        String input = "jqp";
        boolean x =  str.indexOf(input) != -1 || sb.toString().indexOf(input) != -1;
        System.out.println(x);

    }
}
