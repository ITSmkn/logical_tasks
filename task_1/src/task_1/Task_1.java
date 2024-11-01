package task_1;

public class Task_1 {

 
    public static void main(String[] args) {
        System.out.println("\n <first Question> \n");
        
        // note that Q1 and Q3 are the same ...
        
    // ================================== #1 ==============================================
      String[] codes = { "0110011001001100", "0001110111011100", "0000000011110000" }; 
      
      for (String code : codes){ 
          Q1.checkHammingCode(code); 
      }
      
    // ================================================================================
    System.out.println("\n <second Question> \n");
    // ==================================== #2 ============================================
    
    String code = "0110011001001100"; 
    if (Q2.checkParity(code)) { 
        System.out.println("The code has even parity."); 
    } 
    else { 
        System.out.println("The code has odd parity."); 
    }

    // ================================================================================
    System.out.println("\n <third Question> \n");
    // ==================================== #3 ============================================
    
    // just same as the first question ...
    String code3 = "0000000011110000"; 
    Q3.detectAndCorrectError(code3);
    
    }
}
