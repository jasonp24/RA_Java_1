public class JavaPractice {
   public static void main(String[] args) {
      oddEvenPrime(7);
   }
   
   public static void oddEvenPrime(int number) {
      if (number % 2 == 0) {
         System.out.print("Even");
      } else {
         System.out.print("Odd");
      }
      isPrime(number);     
   }
   
   public static void isPrime(int number) {
      boolean choice = false;
      for (int i = 2; i < number / 2; i++) {
         if (number % i == 0) {
            choice = true;
            break;
         }
      }
      if (!choice) {
         System.out.print(" and is a Prime");
      } 
   }
   
}