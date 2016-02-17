
public class consonants 

{
	public static void main(String[]args)
{
		consonants.printconsonants("Sudarshan");
}


static void printconsonants(String s)
{
String consonants = "bcdfghjklmnpqrstvwxyz";

for(int i=0; i < s.length();i++)
{
  if (consonants.indexOf(s.charAt(i))!=-1)
  {
	  System.out.println(s.charAt(i));
  }
}
}}
