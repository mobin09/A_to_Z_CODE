public class Neetcode008 {
    // 14. Longest Common Prefix
    public static void main(String[] args) {
       String[] strs = {"flower","flow","flight"};
       StringBuilder sb = new StringBuilder();
      
     for(int i=0; i<strs[0].length(); i++){
        char ch1 = strs[0].charAt(i);
        boolean isPresent = true;
        for(String s : strs){
            if(i == s.length() || ch1 != s.charAt(i)){
                isPresent = false;
                break;
            }
        }
        if(isPresent == true){
            sb.append(ch1);
        }else{
            break;
        }
     }
           
     System.out.println(sb.toString());
    }
}
