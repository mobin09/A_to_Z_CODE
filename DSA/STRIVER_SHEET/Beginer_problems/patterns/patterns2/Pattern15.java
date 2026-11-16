public class Pattern15 {
    public static void main(String[] args) {
        int n = 4;
        for(int i=0; i<n;i++){
            for(int j = (int)'A'; j< (int)'A' +n -i; j++){
                System.out.print((char)j+" ");
            }
            System.out.println();
        }
    }
}
