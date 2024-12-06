

import java.util.Random;
import java.util.Scanner;
public class Homework03 {
	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		Random r = new Random();
			
		boolean repeatGame = true;
		
		//loop that repeats the game 
		while(repeatGame)
		{
			int computerScore = 0;
			int userScore = 0;
			System.out.println("Let's play a game of rock, paper, scissors! Best of 2 out of 3 rounds wins!");
		//makes sure that the game only repeats 3 times
		for(int i = 0; i<3; i++)
		{
			System.out.println("Enter one of the following: \"rock\",\"paper\" or \"scissors\".");
			String choice = key.nextLine();
			int randomChoice = r.nextInt(3);

		//The random choices from computer
		String computerChoice = "";
		switch(randomChoice)
		{
		case 0:
			computerChoice = "rock";
			break;
		case 1:
			computerChoice = "paper";
			break;
		case 2:
			computerChoice = "scissors";
			break;
		}
		
		System.out.println("The computer chose: " + computerChoice);
		System.out.println(choice+ " vs " +computerChoice);
		
		//determines whether user or computer win
		if(choice.equalsIgnoreCase(computerChoice))
		{
		System.out.println("It's a tie!");
		}
		else if((choice.equalsIgnoreCase("rock") && computerChoice.equals("scissors")) || (choice.equalsIgnoreCase("scissors") && computerChoice.equals("paper")) || (choice.equalsIgnoreCase("paper") && computerChoice.equals("rock")))
		{
			userScore++;
		}
		else
		{
			computerScore++;
		}
		}
		
		//displays score at end of game
		if(userScore > computerScore)
		{
			System.out.println("You won the game!");
			System.out.println("Your score is " +userScore + " vs computer score " + computerScore);
		}
		else if(computerScore > userScore)
		{
			System.out.println("Computer wins the game!");
			System.out.println("Computers score is " +computerScore+ " vs your score " +userScore);
		}
		else
		{
			System.out.println("It's a tie!");
		}
		
		
		
		// ask user if they want to play the game again or not
		System.out.println("Do you want to play the game again? Enter \"Yes\" or \"No\"");
		String repeatGameResponse = key.nextLine();
		repeatGameResponse.equalsIgnoreCase("Yes");
			System.out.println("Ok! Playing game again!");
		}
		System.out.println("Leaving game!");
		System.exit(0);
		
}
}