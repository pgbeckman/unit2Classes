import java.util.Scanner;

public class MilkJarCalculator
{
   public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in);
      double jarCapacity = 0.75; // gallons
      String again = "y";
      while (again.equals("y")) {
      System.out.print("Gallons Of Milk: ");
      double milk = s.nextInt(); // gallons
      int completelyFilledJars = (int) (milk / jarCapacity);
      System.out.println(completelyFilledJars);
      System.out.print("Again: ");
      again = s.next();
     }
   }
}