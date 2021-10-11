import java.util.*;

public class AverageGradeDecker 
{
//Main Method
public static void main (String[] args)
{
	//Declare Variables
	int size = 0;
	String answer;
	
	// Do / Whiel to prompt user to repeat the process
	do
	{
	//Set Scanner Object and prompt user to enter the class size
	Scanner input = new Scanner(System.in);
	System.out.print("Please Enter the Class Size: ");
	size = input.nextInt();
	
	//Assign input to an array and Enter Array Values
	int [] grades = new int [size];
	
	System.out.print("Enter the Class Grades: ");
	for (int i = 0; i < size; i++)
	{
		grades[i] = input.nextInt();
		
	}
	System.out.println(" ");
	
	//Print Display on Console
	System.out.println("Class Size: \t" + size);
	System.out.print("Entered Grades: ");
	//Print Array
	for(int i = 0; i < grades.length; i++)
	{
		System.out.print(grades[i] + " ");
	}
	System.out.println(" ");
	System.out.println("Class Average: \t" + findAverage(grades, size));
	System.out.print("Would You Like to Repeat the Program (Y/N)?: ");
	input.nextLine();
	answer = input.nextLine();
	System.out.println(" ");
	}
	
	while (!answer.equals("N"));
		System.out.println("Program Terminated");
		
		
	
}
//Method to find the Average Recursively
public static double findAverage(int grades[], int size)
{
	double sum;
	double avg;
	
	if (size == 1)
		sum = grades[0];
	else 
		sum = grades[size-1] + (size - 1) * findAverage(grades, size-1);
	
	avg = sum / size;
	return avg;
}
}
