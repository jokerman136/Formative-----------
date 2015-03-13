package controller;

import java.util.Scanner;

public class FormativeController
{
	private int rpsCheck;
	private String compWord;
	private String userWord;
	private Scanner myReader;
	public FormativeController()
	{
		userWord = "";
		compWord = "";
		myReader = new Scanner(System.in);
		rpsCheck = 0;
	}
	
	public void start()
	{
		
		userWord = myReader.nextLine();
		rpsChecker(userWord);
		botChoice(compWord);
		System.out.print(compWord);
		int rpsCheck = 0;
		rpsCompare(rpsCheck, compWord);
	}
	
	
	
	
	public String botChoice(String compWord)
	{
		int botChoice = (int) (Math.random() * 3);
		if(botChoice == 1)
		{
			compWord = "I have chosen rock";
		}
		if(botChoice == 2)
		{
			compWord = "I have chosen paper";
		}
		if(botChoice == 3)
		{
			compWord = "I have chosen scisors";
		}
		return compWord;
	}
	
	public int rpsChecker(String userInput)
	{
		String rock = "rock";
		String paper = "paper";
		String scisors = "scisors";
		
		if (userInput.equalsIgnoreCase(rock))
		{
			rpsCheck = 1;
			return rpsCheck;
		}
		else if (userInput.equalsIgnoreCase(paper))
		{
			rpsCheck = 2;
			return rpsCheck;
		}
		else if (userInput.equalsIgnoreCase(scisors))
		{
			rpsCheck = 3;
			return rpsCheck;
		}
		else
		{
			return rpsCheck;
		}
		
	}
	
	private String rpsCompare(int rpsCheck, String compWord)
	{
		if(compWord.contains("rock") && rpsCheck == 1)
		{
			System.out.print("I picked rock, draw.");
		}
		else if(compWord.contains("rock") && rpsCheck == 2)
		{
			System.out.print("I picked rock, you win.");
		}
		else if(compWord.contains("rock") && rpsCheck == 3)
		{
			System.out.print("I picked rock, I win.");
		}
		else if(compWord.contains("paper") && rpsCheck == 1)
		{
			System.out.print("I picked paper, I win.");
		}
		else if(compWord.contains("paper") && rpsCheck == 2)
		{
			System.out.print("I picked paper, you win.");
		}
		else if(compWord.contains("paper") && rpsCheck == 3)
		{
			System.out.print("I picked paper, draw.");
		}
		else if(compWord.contains("scisors") && rpsCheck == 1)
		{
			System.out.print("I picked scisors, you win.");
		}
		else if(compWord.contains("scisors") && rpsCheck == 2)
		{
			System.out.print("I picked scisors, I win.");
		}
		else if(compWord.contains("scisors") && rpsCheck == 3)
		{
			System.out.print("I picked scisors, draw.");
		}
		else
		{
			System.out.print("ERROR: Restart game.");
		}
		return compWord;
	}
	
}
