package Babu.git;

public class Captialsmallcount 
{
	public static void main (String[] args)
	{
		String word = "Test for Git tool on 08'th feb 08:30pm";
		int capitalcount=0;
		int smallcount=0;
		int numbers=0;
		int spchar=0;
		
		for(int i=0;i<word.length();i++)
		{
			char ch=word.charAt(i);
			
			if (ch>='A'&&ch<='Z')
			{
				capitalcount++;
			}
			else if (ch>='a'&&ch<='z')
			{
				smallcount++;
			}
			else if (ch>='0'&&ch<='9')
			{
				numbers++;
			}
			else
			{
				spchar++;
			}
		}
         System.out.println("Capital letter count is "+capitalcount);
         System.out.println("Small letter count is "+smallcount);
         System.out.println("Numberics count is "+numbers);
         System.out.println("Special charcters and space count is "+spchar);
         
     }

}
