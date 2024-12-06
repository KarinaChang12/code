
import java.util.Scanner;

public class Lab04 {
	
	public static void main(String[] args) {
//creates new scanner object
	Scanner key = new Scanner(System.in);
	
	System.out.println("How many books did you purchase at BN booksellers this month?");
	int numberOfBooks = key.nextInt();

	String points = "";
	
	switch (numberOfBooks)
	{
	//case # shows the amount of books user entered
		case 0: 
			points = "0";
			break;
		case 1:
			points = "5";
			break;
		case 2:
			points = "15";
			break;
		case 3:
			points = "30";
			break;
		case 4:
			points = "60";
			break;	
		default:
			points = "60";
			break;
	}
	//The next following lines is for the different lines printed depending on value entered by user
	if(numberOfBooks >= 1 )
	{
		System.out.println("Congratulations!! You have earned " + points + " points!");
		System.out.println("You may redeem these points on your next purchase!");
	}
	if(numberOfBooks == 0 )
	{
		System.out.println("You have not earned any points yet. Make a book purchase to start earning points!");
	}
	if(numberOfBooks < 0)
	{
		System.out.println("Invalid value entered! Exiting the program");
		System.exit(0);
	}
		/*
		 * 0 books = 0 points earned
		 * 1 book = 5 points earned
		 * 2 books = 15 points earned
		 * 3 books = 30 points earned
		 * 4 + books = 60 points earned
		 */
	}

}