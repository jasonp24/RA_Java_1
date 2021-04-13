public class Car {
   private String model;
   private int year;
   
   public Car(String model, int year) {
      String carModel = model;
      int carYear = year;
   }
   
   public Car() {
      this("Toyota", 2005);
   }
   
   public void move(int distance) {
      while (distance > 0) {
         System.out.print("Moving");
      }
   }
   
}