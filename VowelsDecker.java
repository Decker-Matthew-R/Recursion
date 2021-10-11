import java.util.*;

public class VowelsDecker 
{
public static void main (String[] args)
{
	//Declare Variables / Initialize Scanner
	String text;
	String answer;
	
	// Do/While to allow user to rerun or terminate the program
	do
	{
	Scanner input = new Scanner(System.in);
	System.out.print("Enter A Text String:");
	text = input.nextLine();
	System.out.println ("Entered String: " + text);
	
	//Calls the returnVowels Method and Repeats the Exercise if Desired
	System.out.println("Number of Vowels: " + returnVowels(text, text.length()));
	System.out.print("Would You Like to Repeat The Exercise(Y/N): ");
	answer = input.nextLine();
	System.out.println(" ");
	
	}
	while (!answer.equals("N"));
		System.out.println("Program Terminated");
		
		
	
}
//Method to determine what is a vowel
public static int determineVowel(char vowel)
{
	if(vowel == 'A' || vowel == 'a' || vowel == 'E' || vowel == 'e' || vowel == 'I' || vowel == 'i' || vowel == 'O' || vowel == 'o' || vowel == 'U' || vowel == 'u')
		return 1;
	else return 0;
				
}


// countVowels Method to recursively Count the vowels
public static int returnVowels(String text, int t)
{
	//Base Case
	if (t == 1)
		return determineVowel(text.charAt(t-1));
	return returnVowels(text, t-1) + determineVowel(text.charAt(t-1));
}
}
