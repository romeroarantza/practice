import java.util.*;

public class BowlingTeamDemo
{
   public static void main(String[] args)
   {
      String name;
      BowlingTeam bowlTeam = new BowlingTeam();
      int x;
      final int NUM_TEAM_MEMBERS = 4;
      Scanner input = new Scanner(System.in);
      
      //prompt for the bowling team name
      System.out.println("Enter team name >> ");
      name = input.nextLine();
      bowlTeam.setTeamName(name);
      
      //in a loop prompt the members' names
      for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
      {
         System.out.print("Enter team member's name >> ");
         name = input.nextLine();
         bowlTeam.setMember(x, name);
      }
      
      //display details of the team 
      System.out.println("\nMembers of team " 
      + bowlTeam.getTeam() + ":"); //page 388
      for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
         System.out.print(bowlTeam.getMember(x) + " ");
      System.out.println();
   }
}