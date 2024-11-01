package task_1;

public class Task_1 {

 
    public static void main(String[] args) {
        System.out.println("\n <first Question> \n");
    // ================================== #1 ==============================================
      String[] codes = { "0110011001001100", "0001110111011100", "0000000011110000" }; 
      
      for (String code : codes){ 
          Q1.checkHammingCode(code); 
      }
      
    // ================================================================================
    System.out.print("\n <second Question> \n");
    // ==================================== #2 ============================================
    
    String code = "0110011001001100"; 
    if (Q2.checkParity(code)) { 
        System.out.println("The code has even parity."); 
    } 
    else { 
        System.out.println("The code has odd parity."); 
    }
    }
    
    // ================================================================================
    // ==================================== #3 ============================================
    
}
