package controller;

import java.util.Scanner;

public class Controller
{
	
	
	public void start()
	{
		System.out.println("Macaroni");
		
		//questions();
		
		moreInput();
		
	}
	
	private void questions() //only Controller can see this
	{
		System.out.println("What is your favorite color?");
		Scanner inputScanner = new Scanner(System.in);
		
		String answer = inputScanner.nextLine();
		System.out.println(answer);
		
		System.out.println("What is the answer?");
		answer = inputScanner.nextLine();
		System.out.println(answer);
		
		System.out.println("What is your favorite flavor of chocolate milkshake?");
		answer = inputScanner.next();
		System.out.println(answer);
		answer = inputScanner.next();
		System.out.println(answer);
		
		System.out.println("What is your favorite duck?");
		answer = inputScanner.next();
		System.out.println(answer);
		
		System.out.println(answer);
		answer = inputScanner.next();
		System.out.println(answer);;
		
		
		//inputScanner.close(); 
		//closed because I am still using the InputStream from the keyboard 
		//and don't want errors
	}
	
	private void moreInput() //only things inside the Controller can see this
	{
		Scanner textScanner; //declaration of a Scanner variable.
		textScanner = new Scanner(System.in); //initialization of the textScanner variable
		
		System.out.println("Type your favorite number.");
		int userNumber = textScanner.nextInt();
		System.out.println("Your favorite number is: " + userNumber); 
		//in this context the plus sign is the concatenation operator
		textScanner.nextLine(); //call .nextLine() to consume the enter key press
		
		System.out.println("Type in some more information");
		String words = textScanner.nextLine();
		System.out.println(words);
		
		System.out.println("Type in as many digits of Pi as you can");
		double piDigits = textScanner.nextDouble();
		System.out.println(piDigits);
		textScanner.nextLine(); //call .nextLine() to consume the enter key press
		
		System.out.println("Type in your favorite vowel.");
		String favVowel = textScanner.next();
		System.out.println(favVowel+ "? Why do you have a favorite vowel?? Okay then you dork.");
		textScanner.nextLine();
		
		System.out.println("Now type in the name of your neighbor's guinea pig.");
		String guineaPigName = textScanner.nextLine();
		System.out.println("Why do you know your neighbor's guinea pig is named "
		+ guineaPigName + "? Okay then??");
		
		System.out.println(" ");
		System.out.println("...That is all.");
		
		
		textScanner.close(); //closes the strain
		
	}
	
	public boolean validInt(String sample)
	{
		boolean isValid = false; //declare and initialize
		
		try //see if it works 
		{
			Integer.parseInt(sample); //if we can parse int into the sample
			isValid = true; // then isValid is true
		}
		catch(NumberFormatException error) //if it doesn't work do this
		{
			System.out.println("You need to type in a number, mammal!");//tell user what's wrong
		}
		
		return isValid; 
		
		
	}
	
	public boolean validDouble(String example)
	{
		boolean isValid = false;
		
		try
		{
			Double.parseDouble(example);
			isValid = true;
		}
		catch (NumberFormatException oops)
		{
			System.out.println("Only floating point vvalues are accepted.");
		}
		return isValid;
		
	}
	
} //end of Controller class
