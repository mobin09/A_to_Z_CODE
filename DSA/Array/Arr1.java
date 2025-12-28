public class Arr1 {
   

      public static String checkOpt(String str){
        char[] arr = str.toCharArray();
        int i=0;
        int j= str.length()-1;
        while(i < j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
       return String.valueOf(arr);

      }

     public static void main(String[] args){
        
        String string1 = "amazon";
        String string2 = "azonam";
        String str = "MOBIN"; // -->INMOB
       // amazon --> nozama --> amazon --> 
       
       String second = string1.substring(2);
        String  first = string1.substring(0, 2);
        String opt = second + first;

       String  str1 = str.substring(0, str.length() - 2);
       String str2 = str.substring(str.length() -2);
       System.out.println(str2 + str1);


       
        if(opt.equals(string2)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

       // String str = checkOpt(opt);
        //System.out.println(str);




        // int count =0;
        // while(count < 2){
        //     // reverse logic
        //     // 
            
            
        //     Syatem.out.println();
        //     String str = checkOpt(string1);
        //     System.out.println("First Output::" + str);
        //     if(str.equals(string2)){
        //         System.out.println("YES");
        //         return;
        //     }else{
        //         string1 = str;
        //     }
        //   count++;
        // }
      
        // System.out.println("NO");
        
     }
}
