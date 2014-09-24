package com.d;

public class convert {
 
    public static void main(String args[]) {
 
        int bin[] = {1,1,0,0,1,0}; // Our test array containing the binary
 
        System.out.println(Bin2Dec(bin));
          
    }
 
 
 
    private static long Bin2Dec(int[] bin) {
 
        long decValue=0L;
 
 
 
        for (int i=0; i<bin.length; i++) {
 
                  decValue <<= 1; // Shift content of decValue 1 position to the left
 
                  decValue += bin[i]; // add the 0 or 1
 
        }
 
 
 
        return decValue;   
 
    }
 
}
