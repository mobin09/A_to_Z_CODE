package Schooling;

import java.util.Arrays;

public class UpperCaseConversion {

    public static  String capital(String str){
        String s = str.substring(0,1).toUpperCase()+str.substring(1);
        return s;
    }


    public static void main(String[] args){
        String str = "i love programming";
           String a =  str.substring(1);
           System.out.println(a);
        String[] s = str.split(" ");
        //System.out.println(Arrays.toString(s));
        String fString = "";
        for(int i=0; i<s.length; i++){
            fString += capital(s[i]) + " ";
        }
       
        System.out.println(fString);

    }
}
