/*The Number Guessing Game 🎲
A game asks the player to guess a number between 1 and 100.
Core Java Scenario Based Problem Statements
● Use do-while loop.
● Give hints like "Too high" or "Too low".
● Count attempts and exit after 5 wrong tries. */

import java.util.*;
public class GuessingGame
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = (int) (Math.random())*100+1;
		if(1<= n && n<=100)
		{
			System.out.println("Welcome to the Number Guessing Game!");
			System.out.println("Enter your guess: ");
			int userInput = sc.nextInt();
			int i = 1;

			do
			{

			
				if(n==userInput)
				{
					System.out.println("Winner...");
					break;
				}else if(n > userInput)
				{
					/*if(userInput> (userInput-5))
					{
					System.out.println("Too low");
					}else if(userInput<(userInput+5))
					{
					System.out.println("Too low");

					}*/


					System.out.println("Too low! Try a higher number.");

				i++;
				}else
				{
					System.out.println("Too high! Try a lower number.");
					i++;
				}
				System.out.println("Again,  Enter User Input");
				userInput=sc.nextInt();
                                sc.nextLine();

				
				

			}
                        while(i<5);
			System.out.println("Try next time...");
			
		}else
		{
			System.out.println("Invalid input. Please enter an integer.");
		}
	}
}