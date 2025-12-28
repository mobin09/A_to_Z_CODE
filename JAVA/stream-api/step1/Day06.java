package step1;

public class Day06 {
    public static void main(String[] args){
        int n = 5;
        int[] a = {800, 850, 900, 950, 1000 };
        int[] b = {600, 800, 1000, 1200, 1400        };

        int i=0;
        int happyCount = 0;
        int unhappyCount = 0;
        while(i <n){
             int alice = a[i];
             int bob = b[i];
             if(alice > bob){
                int newbob = 2 * bob;
                if(alice > newbob){
                    unhappyCount++;
                } else{
                    happyCount++;
                } 
             } else if(bob > alice){
                 int newAlice = 2 * alice;
                 if(bob > newAlice){
                    unhappyCount++;
                 }else{
                    happyCount++;
                 }
             } else{
                happyCount++;
             }
             i++;
        }

        System.out.println(happyCount);

        // 100 200 300
//300 200 100
    }
}
