/*8. Shopkeeper’s Discount Dashboard 🛍️
A shopkeeper gives discounts based on total bill:
● Input item prices in a for-loop.
● Use if-else for discount logic.
● Use proper indentation, constants, and comments.*/

import java.util.Scanner;
public class ShopKeeperDiscountDashbord
{
	public static void main(String args[])
	{
		char choice;
		do
		{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---- Welcome to the Shop ----");

		double totalAmount = 0;
		double discount = 0;
		System.out.println("Enter number of items: ");
		int items = sc.nextInt();
		sc.nextLine();

	    String[] itemNames = new String[items];
		double[] itemPrices = new double[items];
		
		for(int i = 0; i <items; i++)
		{
			
			System.out.print("Enter name of item "+ (i+1) + ": ");
			itemNames[i] = sc.nextLine();
			
			System.out.print("Enter price of " + itemNames[i]+ ": ");
			itemPrices[i] = sc.nextDouble();
			sc.nextLine();
			
			totalAmount+=itemPrices[i];
		}


		if(totalAmount>= 1000 && totalAmount<2000)
		{
			discount= (totalAmount*5)/100;
			
			
		}else if(totalAmount>= 2000 && totalAmount<3000)
		{
			discount= (totalAmount*7)/100;
			
			
		}else if(totalAmount>= 3000 )
		{
			discount= (totalAmount*10)/100;
			
		}
		
		double finalAmount = totalAmount-discount;
		
		
		System.out.println("\n------------- BILL --------------------");
		System.out.printf("%-15s %10s%n", "Item", "Price");
		
		for(int i = 0;i<items;i++)
		{
			System.out.printf("%-15s %10.2f%n", itemNames[i], itemPrices[i]);
		}
		
		System.out.println("--------------------------------------");
		System.out.printf("%-20s : %10.2f%n", "Total  Amount", totalAmount);
		System.out.printf("%-20s : %10.2f%n", "Discount", discount);
		System.out.println("--------------------------------------");
		System.out.printf("%-20s : %10.2f%n", "Payable Amount", finalAmount);
		System.out.println("--------------------------------------");
		
		System.out.print("\nDo you want to run again ? (y/n) : ");
		choice = sc.next().charAt(0);
		sc.nextLine();
		
		}while(choice == 'y' || choice == 'Y');
		 System.out.println("\nThank you for using ShopKeeper Discount Dashboard!");
	}
}