import java.util.*;

public class BowlingTeamDemo2
{
   public static void main(String[] args)
   {
      String name;
      final int NUM_TEAMS = 4;
      BowlingTeam[] teams = new BowlingTeam[NUM_TEAMS];
      int x; //subscript for team member names
      int y; //subscript for teams
      final int NUM_TEAM_MEMBERS = 4;
      Scanner input = new Scanner(System.in);
      
      //allocate memory for each array element of the team
      for(y = 0; y < NUM_TEAMS; ++y)
      {
         teams[y] = new BowlingTeam();
         
         //prompt for the bowling team name
         System.out.println("Enter team name >> ");
         name = input.nextLine();
         teams[y].setTeamName(name);
         
         //in a loop prompt the members' names
         for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
         {
            System.out.print("Enter team member's name >> ");
            name = input.nextLine();
            teams[y].setMember(x, name);
         }//nested loop
      }// end of team for loop
     
      //display details of the team 
      for(y = 0; y < NUM_TEAMS; ++y)
      {
         System.out.println("\nMembers of team " 
         + teams[y].getTeam() + ":");
         for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
            System.out.print(teams[y].getMember(x) + " ");
         System.out.println();
       }
   }
}