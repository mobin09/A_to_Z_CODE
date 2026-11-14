public  class Pattern14 {
   public static void main(String[] args) {
      int n = 4; 
      for(int i=1; i<=n; i++){
         for(int j = (int)'A'; j < (int)'A' + i; j++){
            System.out.print((char)j);
         }
         System.out.println();
      }
   }
    
}