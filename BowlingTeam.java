public class BowlingTeam
{
   private String teamName;
   //an array of private fields
   private String[] members = new String[4];
   
   //get and set methods for the teamName field
   public void setTeamName(String team)
   {
      teamName = team;
   }
   public String getTeam()
   {
      return teamName;
   }
   
   //set and get methods for the team member's name
   //requires 2 arguments: the position subscript + a string name
   public void setMember(int number, String name)
   {
      members[number] = name;
   }
   //the get method requires a subscript
   public String getMember(int number)
   {
      return members[number];
   }
   
}
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
