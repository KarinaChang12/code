import java.util.Scanner;
public class Lab06 {

	public static void main(String[] args) {

	Scanner key = new Scanner(System.in);	//creates new scanner object
		
	System.out.print("Enter the height of the triangle:");	//allows the user to input height for the triangle
	int height = key.nextInt();	
	
	for(int i = 0; i <= height; i++)	//lines 12-18 create the first half of the triangle
	{
		for(int j = 1; j <= i; j++)
		{
			System.out.print("*");// This prints out asterisks to print the shape of the triangle
		}
		System.out.println();
	}		
	
	
	for(int i = height - 1; i >= 1; i--)	//lines 21-27 create the second half of the triangle
	{
		for(int j = 1; j <= i; j ++)
		{
			System.out.print("*");
		}
		System.out.println();
	}	
	System.out.println("End of program!");
	}
}