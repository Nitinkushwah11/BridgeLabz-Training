import java.util.Scanner;

class FindTheAgeOfHarry
{
  public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);
     int BirthYear = 2000;
     System.out.println("Enter the current Year");
     int currentYear = sc.nextInt();
     System.out.println("Harry's age in " + currentYear + " is " + (currentYear - BirthYear)); 
   }
}