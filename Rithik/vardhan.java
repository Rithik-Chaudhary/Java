package Rithik;

import java.util.Arrays;

public class vardhan {
    public static void main(String[] args) {
        
        int arr[] = new int[4];
        arr[0]=1;
        System.out.println(Arrays.toString(arr));

        String[] myStrings = new String[3];
        myStrings[0] = "Harshvardhan";
        myStrings[1] = "Ayush tyagi";
        System.out.println(Arrays.toString(myStrings));


        int min = arr[0];
        for (int i =1; i< arr.length;i++){
            if (min > arr[i])
            min = arr[i];
        }
        System.out.println("Min Element is" + min );

    }
    
}
