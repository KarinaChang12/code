import java.util.Scanner;
public class Lab05 {
	
//set values for cost of chocolate bars and coupons needed to redeem
public static final int COST = 1;
public static final int COUPON = 6;

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		
		System.out.println("How many dollars would you like to spend on chocolate from the vending machine?");
		int dollars = key.nextInt();
		
		int numberOfChocolateBars = dollars;
		
		int numberOfCoupons = numberOfChocolateBars;
		
		//loop that redeems coupons and shows the amount of chocolate bars that can be bought
		while(numberOfCoupons >= COUPON)
		{
			//calculates for coupons and chocolate bars
			int extraChocolateBars = numberOfCoupons / COUPON;
			numberOfChocolateBars = numberOfChocolateBars + extraChocolateBars;

			numberOfCoupons = numberOfCoupons % COUPON + extraChocolateBars;
			System.out.println("You can buy " + numberOfChocolateBars + " chocolate bars and will have " + numberOfCoupons + " coupons left!");
		}
		
		//if value is below 0 then the program will exit
		if(dollars < 0)
		{
			System.out.println("Invalid value for amount! Exiting the program!");
			System.exit(0);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
