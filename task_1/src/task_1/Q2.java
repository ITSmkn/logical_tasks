 
package task_1;

 
public class Q2 {
     
        public static boolean checkParity(String code) { 
    
        int count = 0;
    
        for (int i = 0; i < code.length(); i++){ 
            if (code.charAt(i) == '1'){ 
                count++; 
            } 
        } 
        
        return count % 2 == 0; 
    }
    
}
