// Java code to demonstrate star pattern
import java.util.*;
 
class StarPatternDecker
{
  
   // function to print spaces
   public static void spaces(int space)
   {
      // base case
      if (space == 0)
         return;
      System.out.print(" ");
 
      // recursively calling print_space()
       spaces(space - 1);
   }

   // function to print stars
   public static void stars(int star)
   {
      // base case
      if (star == 0)
         return;
      System.out.print("* ");
 
      // recursively calling star()
      stars(star - 1);
}

 
   // Method to print stars
   public static void printStars(int n, int num)
   {
      // base case
      if (n == 0)
        return;
    spaces(2*n - 1);
    stars((2*(num - n) + 1));
    System.out.println("");
 
    // recursively calling stars()
    printStars(n - 1, num);
   }

   public static void main(String[] args)
   {
      //Initialize Scanner and variables
		Scanner input = new Scanner(System.in);
		int rows;
      
      System.out.print("Enter Number of Rows:  ");
      rows = input.nextInt();
      printStars(rows, rows);
   }
}