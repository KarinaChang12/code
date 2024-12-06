
import java.util.Scanner;
public class Lab07 {

	public static void main(String[] args) {
		
	Scanner key = new Scanner(System.in);
		
	System.out.println("Enter the number of rows in matrix1: ");	//user input for the dimensions of the matrix
	int matrix1_rows = key.nextInt();
	
	System.out.println("Enter the number of columns in matrix1: ");
	int matrix1_columns = key.nextInt();
	
	int matrix2_rows;
	int matrix2_columns;
	
	
	while(true) //while loop that allows the user to re-enter values until they match values of matrix1
	{
		System.out.println("Enter the number of rows in matrix2: ");
		matrix2_rows = key.nextInt();
		
		System.out.println("Enter the number of columns in matrix2: ");
		matrix2_columns = key.nextInt();
		
		
		if(matrix2_rows == matrix1_rows && matrix2_columns == matrix1_columns)
		{
			break;
		}
		else
		{
			System.out.println("Dimensons are mismatch! The matrices cannot be added!"); //If matrix2 rows don't match matrix1 rows
			System.out.println("Try again! Enter dimensions of matrix2 until they match dimensions of matrix1.");
		}
	}
	
	
	int [][] matrix1 = new int [matrix1_rows][matrix1_columns]; //creates matrix 1
	
	int [][] matrix2 = new int [matrix2_rows][matrix2_columns]; //creates matrix 2
	
	
	
	for(int i = 0; i < matrix1_rows; i++) //input for value for matrix 1
	{
		for(int j = 0; j < matrix1_columns; j++)
		{
			System.out.println("Enter the value of the matrix at position ("+i+","+j+"):"); // location of the value
			matrix1[i][j] = key.nextInt();
		}
	}
		
	
	
	for(int i = 0; i < matrix2_rows; i++) // input for values in matrix 2
	{
		for(int j = 0; j < matrix2_columns; j++)
		{
			System.out.println("Enter the value of the matrix at position ("+i+","+j+"):"); //location of the value
			matrix2[i][j] = key.nextInt();
		}
	}
		
	
	
	int [][] sumMatrix = new int [matrix1_rows][matrix1_columns];	
		
	
	for(int i = 0; i < matrix1_rows; i++) //prints the sum of matrices
	{
		for(int j = 0; j < matrix2_columns; j++)
		{
	
			sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
		}
	}
	

	for(int i = 0; i < matrix1_rows; i++)
	{
		for(int j = 0; j < matrix2_columns; j++)
		{
			System.out.print(sumMatrix[i][j] + "  "); //The space in the quotations separates the sum between the matrices
		}
		System.out.println();
	}
	
	
	}

}
