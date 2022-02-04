import java.util.*;

public class DistanceFromAverage
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      
      double[] distanceArray = new double[15];
      
      double distance;
      int count = 0;
      double total = 0;
      final int QUIT = 99999;
      final int MAX  = 15;
      
      System.out.println("Enter the distance or " 
      + QUIT + " to quit >>");
      
      distance = sc.nextDouble();
      
      while(distance != QUIT)
      {
         distanceArray[count] = distance; //assigns to the array
         total += distanceArray[count];
         ++count;//control variable
         //onced maxed nested if
         if(count == MAX)
            distance = QUIT;
         //continue prompting values
         else
         {
            System.out.println("Enter next distance value or enter "
            + QUIT + " to quit >>");
            distance = sc.nextDouble();
         }
            
      }//while
      
      if(count != 0)
      {
         System.out.println("\nThe distance values entered: ");
         for(int y = 0; y < distanceArray.length; y++)
            System.out.print(distanceArray[y] + " ");
         System.out.println("\nThe average is " 
         + (total * 1.0 / count));
      }//if
      else
         System.out.println("No scores were entered.");
   }//main
}//class