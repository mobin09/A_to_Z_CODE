public class Day0012 {
    public static void main(String[] args) {
        String str = "CDCDCDCDCDCDCD";
        int X = 400;
        int carlsenWin = 0;
        int chefWin = 0;
        int draw = 0;
        int i=0;
        while(i < str.length()){
            char ch = str.charAt(i);
            if(ch == 'C'){
                carlsenWin++;
            }else if(ch == 'N'){
                chefWin++;
            }else{
                // draw loginc
                draw++;
            }
            i++;
        }
        int prize = 0;
        int scoreCharls = carlsenWin * 2 + (14 - chefWin) * 1;
        int scoreChecf = chefWin * 2 + (14 - carlsenWin) * 1;
        if(scoreCharls > scoreChecf){
           prize =  X * 60;
        }else if(scoreCharls == scoreChecf){
            prize = X * 55;
        }else{
            prize = X * 40;
        }
       
        System.out.println(prize);
       
    }
}