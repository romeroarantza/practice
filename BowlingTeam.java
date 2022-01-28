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