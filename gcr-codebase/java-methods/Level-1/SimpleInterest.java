import java.util.Scanner;

public class SimpleInterest
{

	public static void simpleInterest()
	{

	//Take input from the Scanner class
	Scanner sc = new Scanner(System.in);

	
	//Input the Principal
	System.out.println(" Enter the Principal : ");
	double principal = sc.nextDouble();

	
	System.out.println(" Enter the Rate : ");
	double rate = sc.nextDouble();

	System.out.println(" Enter the Time : ");
	double time = sc.nextDouble();

	double simpleInterest = (principal*rate*time)/100;

	System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal+ ", Rate of Interest " + rate+ " and Time " + time);


	}
	public static void main(String args[])
	{
	
	simpleInterest();
	
	}

}