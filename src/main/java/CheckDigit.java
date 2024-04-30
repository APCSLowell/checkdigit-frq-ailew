public class CheckDigit {   

   /** Returns the check digit for num, as described in part (a).  
    *  Precondition: The number of digits in num is between one and    
    *  six, inclusive.  
    *          num >= 0  
    */  
   public static int getCheck(int num) {  
     int sum = 0;
     for(int i = 1; i <= getNumberOfDigits(num); i++){
        sum += (8 - i + 1) * getDigit(num, i);
     } 
     return sum % 10;
   }
 
   /** Returns true if numWithCheckDigit is valid, or false    
    *  otherwise, as described in part (b). 
    *  Precondition: The number of digits in numWithCheckDigit   
    *  is between two and seven, inclusive.
    *                numWithCheckDigit >= 0     
    */     
   public static boolean isValid(int numWithCheckDigit) {      
     int check = numWithCheckDigit % 10;
     int num = numWithCheckDigit / 10;
     int newCheck = getCheck(num);
     return check == newCheck;
   }    
   
   /** Returns the number of digits in num. */    
   public static int getNumberOfDigits(int num) {      
      int count = 0;
      while (num > 0) {
          count++;
          num /= 10;
      }
      return count;
   }    
   
   /** Returns the nth digit of num.      
    *  Precondition: n >= 1 and n <= the number of digits in num     
    */    
   public static int getDigit(int num, int n) {      
      while (n > 1) {
          num /= 10;
          n--;
      }
      return num % 10;
   }     
}
