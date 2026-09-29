import java.util.Scanner;

public class Calculator {// Class CalculateShippingCosts

  public static void main(String[] args) {// main()
    double itemPrice;// num itemPrice
    double shippingCost;// num shippingCost
    double totalCost;// num totalCost
    Scanner in = new Scanner(System.in);
    System.out.println("enter the price of the item to calculate shipping costs: ");// output "enter the price of the item to calculate shipping costs: "
    if (in.hasNextDouble()) {
      itemPrice = in.nextDouble();// input itemPrice
      if (itemPrice >= 100) {// if itemPrice >= 100 then
        shippingCost = 0;// shippingCost = 0
        totalCost = itemPrice;// totalCost = itemPrice
      }
      else {// else
        shippingCost = 0.02 * itemPrice;// shippingCost = 0.02 * itemPrice
        totalCost = itemPrice + shippingCost;// totalCost = itemPrice + shippingCost
      } // end if
      System.out.println("the shipping cost is $" + shippingCost + " and the total cost is $" + totalCost);// output "the shipping cost is $" + shippingCost + " and the total cost is $" + totalCost

    }// end if
    else {
      String trash = in.nextLine();
      System.out.println("Please enter a valid number. you entered: " + trash);
    }

  }
}// end class
