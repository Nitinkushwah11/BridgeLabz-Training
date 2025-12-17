public class CalculateProfitAndLoss
{
  public static void main(String args[])
  {
     
     int costPrice = 129;
     int sellingPrice = 191;


     //logic part
     int profit = sellingPrice-costPrice;
     double profitPercentage = (double)((double)profit/costPrice)*100;

     //output part
     System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);
     
  }
}
