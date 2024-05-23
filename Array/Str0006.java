import java.util.Stack;

public class Str0006 {
    //https://leetcode.com/problems/goal-parser-interpretation/description/
    public static void main(String[] args) {
         String command = "G()()()()(al)";
        // command = command.replace("()", "o").replace("(al)", "al");
        // System.out.println(command);
        StringBuilder sb = new StringBuilder();
        Stack<String> st = new Stack<>();
        for(int i=0; i<command.length(); i++){
            String ch = command.charAt(i)+"";
            if(ch.equals("G")){
                sb.append(ch);
            }else if(ch.equals("(") || ch.equals("a") || ch.equals("l")){
                st.push(ch);
            }else if(ch.equals(")")){
                StringBuilder sb2 = new StringBuilder();
                if(!st.empty()){
                    for(int j =0; j<st.size(); j++){
                        String p = st.pop();
                        sb2.append(p);
                        if(p.equals(")")){
                            break;
                        }
                    }
                }
                sb2 = sb2.reverse();
                if(sb2.toString().equals("()")){
                    sb.append("o");
                }else if(sb2.toString().equals("(al)")){
                    sb.append("al");
                }
            }
        }

        System.out.println(sb.toString());

    }
    
}
