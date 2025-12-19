import java.util.Scanner;
// Create CheckStudentCanVote  Class to check the student can vote //depending on age
public class CheckStudentCanVote
{
	public static void main(String args[])
	{
		//Create a Scanner Object
		Scanner sc = new Scanner(System.in);

		//Declare the 1D Array
		int studentAge[] = new int[10];

		//Input the elements of the 2D Array
		System.out.println("Enter the elements of the 1D array: ");
		for(int i = 0; i<studentAge.length; i++)
		{
			studentAge[i] = sc.nextInt();
		}

		//Display the elements of the 1D Array and check the //student can vote or not

		System.out.println("The elements of the 1D Array are: ");

		for(int i = 0; i<studentAge.length; i++)
		{
			if(studentAge[i] < 0)
			{
				System.out.println("Invalid Age");

			}else if(studentAge[i] >= 18)
			{
				System.out.println("The student with the Age "+ studentAge[i]+ " can vote");

			}else if(studentAge[i] < 18)
			{
				System.out.println("The student with the Age "+ studentAge[i]+ " cannot vote");
			}

		}
	}
}