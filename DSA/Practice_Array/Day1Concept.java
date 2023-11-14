package Practice_Array;

import java.util.Arrays;

public class Day1Concept{
    public static void main(String[] args){
        int[] arr = new int[6];
        arr[0] = 2;
        arr[1] = 3;
        arr[2] = 7;
        arr[3] = 9;
        arr[4] = 10;
        arr[5] = 6;
        System.out.println(arr); // it prints the reference of array  [I@d716361
        // [ --> one dimension array, I --> of type Integer

        int[] arr1 = {1,2,3};
        System.out.println(arr1);
        int[] arr2 = new int[]{3,5,10};
        System.out.println(arr2);

        System.out.println(Arrays.toString(arr));
        int[] arr3 = new int[3]; // by default arrays are intitialized with default value of its data type
        System.out.println(Arrays.toString(arr3));

        // getting the data from array with the index value
        String[] strArr = new String[2]; // default value of any object is null so String is class so its default value is null
        System.out.println(Arrays.toString(strArr));
        strArr[0] = "Mobin";
        strArr[1] = "Arshad";        
        System.out.println("Full name of person is: " + strArr[0] + " " + strArr[1]);

    }
}