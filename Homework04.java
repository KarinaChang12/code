
import java.util.Scanner;
public class Homework04 {
	public static final double PI = 3.14;
	public static void main(String[] args) {

	Scanner key = new Scanner(System.in); //creates new scanner object
	
	boolean sortCircles = true;
	double[] circles = new double[0];
	
	System.out.println("This program will sort a collection of circles in a variety of ways based on the area of the circle.");
	
	while(sortCircles)
	{
		System.out.println("1. Total number of circles to store in the collection and the radius of each circle in the collection: ");
		System.out.println("2. Sort and display the circles' area from smallest to largest ");
		System.out.println("3. Sort and display the circles' area from largest to smallest ");
		System.out.println("4. Find and display all unique circles' areas in the collection ");
		System.out.println("5. Quit the program");
		System.out.println("Enter the number that corresponds with the option you chose: ");
		
		int option = key.nextInt();
		
			switch(option)
			{
			case 1:
				System.out.println("Enter the number of Circles: ");
				int numberOfCircles = key.nextInt();
				
				circles = new double [numberOfCircles];
				for(int i = 0; i < numberOfCircles; i++)
				{
					System.out.println("Enter the radius of each circle: ");
					double radius = key.nextDouble();
					circles[i] = PI * radius * radius;
				}
				break;
				
				
			case 2:
				if(circles.length == 0)
				{
					System.out.println("This collection is empty. You must create circles first.");
				}
				else
				{
					for(int j = 0; j < circles.length - 1; j++) //sorts the circles from smallest to largest
					{
						int minIndex = j;
						double smallest = circles[j];
						for(int n = j+1; n < circles.length; n++)
						{
							if(circles[n] < smallest)
							{
								smallest = circles[n];
								minIndex = n;
							}
						}
						if(minIndex != j)
						{
							double sort = circles[j];
							circles[j] = circles[minIndex];
							circles[minIndex] = sort;
						}
						
					}
					for(int j = 0; j < circles.length; j++)
					{
						System.out.println("Areas: " + circles[j]); //prints the areas of the circles
					}
				}
				break;
				
				
			case 3:
				if(circles.length == 0)
				{
					System.out.println("This collection is empty. You must create circles first.");
				}
				else
				{
						for(int j = 0; j < circles.length - 1; j++) //sorts the circles from largest to smallest
						{
							int maxIndex = j;
							double largest = circles[j];
							for(int n = j + 1; n < circles.length; n++)
							{
								if(circles[n] > largest)
								{
									largest = circles[n];
									maxIndex = n;
								}
							}
							if(largest > circles[j])
							{
								double sort = circles[j];
								circles[j] = circles[maxIndex];
								circles[maxIndex] = sort;
							}
							for( j = 0; j < circles.length; j++)
							{
								System.out.println("Areas: " + circles[j] + ""); //prints the areas
							}
					}
				}
				break;
				
				
			case 4:
				if (circles.length == 0)
				{
					System.out.println("This collection is empty. You must create circles first.");
				}
				else
				{
					
					boolean unique = false;
					
					for(int i = 0; i < circles.length; i++)
					{
						boolean isUnique = true;
						
						for(int j = 0; j < circles.length; j++)
						{
							if(i != j && circles[i] == circles[j])
							{
								isUnique = false;
								break;
							}
						}
						if(isUnique)
						{
							System.out.println("Unique area: " + circles[i]);//prints the unique areas
							unique = true;
						}
					}
					if(!unique)
					{
						System.out.println("Cannot display unique areas. ");
					}
				}
				break;
				
				
			case 5:
				sortCircles = false;
				System.out.println("Quitting Program.");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid! Enter something else!"); //if an invalid choice is enter this will print
				break;
			}
		}	
	}
	}