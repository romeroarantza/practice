import java.util.Scanner;
import java.util.Arrays;

public class promptAnagrams 
{

    static boolean isAnagram(String a, String b) 
    {
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        char aa[] = a.toCharArray();
        char bb[] = b.toCharArray();
        
        if(a.length() != b.length())
            return false;
        else{
            Arrays.sort(aa);
            Arrays.sort(bb);
            boolean isSame = java.util.Arrays.equals(aa, bb);
            return isSame;
        }
    }

    public static void main(String[] args) 
    {
    
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        sc.close();
        boolean flag = isAnagram(a, b);
        System.out.println( (flag) ? "Anagrams" : "Not Anagrams" );
    }
}