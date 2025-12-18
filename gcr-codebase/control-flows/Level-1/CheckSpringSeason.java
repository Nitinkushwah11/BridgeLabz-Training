import java.util.Scanner;

public class CheckSpringSeason
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int month = sc.nextInt();
		int day = sc.nextInt();
           
                switch(month)
		{
			case 3: if(day>=20 && day<=31) System.out.println("Its a Spring Season");
			break;

			case 4:  if(day>=1 && day<=30) System.out.println("Its a Spring Season");
			break;

			case 5:  if(day>=1 && day<=31) System.out.println("Its a Spring Season");
			break;

			case 6:  if(day>=1 && day<=20) System.out.println("Its a Spring Season");
			break;

			default: System.out.println("Not a Spring Season");
		}
	}
}