package task_1;


public class Q1 {
    public static int calculateParity(int[] bits, int pos){ int parity = 0; 
    for (int i = 0; i < bits.length; i++){ 
        if ((i + 1 & pos) != 0){ 
            parity ^= bits[i];
    } 
    } 
     return parity;
}
    
    public static void checkHammingCode(String code){ 
        int[] bits = new int[code.length()]; 
        
        for (int i = 0; i < code.length(); i++) { bits[i] = Character.getNumericValue(code.charAt(i)); } 
        
        int[] parityBits = {1, 2, 4, 8, 16}; int errorPosition = 0; 
        
        for (int parity : parityBits) { int parityCheck = calculateParity(bits, parity); errorPosition += parityCheck * parity; } 
        if (errorPosition == 0){ 
            System.out.println("No error detected for code: " + code); 
        } 
        else { 
            System.out.println("Error detected at position " + errorPosition + " for code: " + code); 
        
            bits[errorPosition - 1] ^= 1; 
        
            System.out.print("Corrected code: "); 
        
            for (int bit : bits){ 
                System.out.print(bit); 
        } 
            System.out.println(); 
    } // end of else ... 
    }
}
