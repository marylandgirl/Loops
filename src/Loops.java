import java.util.Scanner;
/*
* This class is for an assignment from Java Bootcamp for the purpose
*    of practicing loops
* Kim Levin
* 4/22/2020
*/
public class Loops {
   public static void main(String[] args) {

      Scanner keyboard = new Scanner(System.in);
      int number = 0;


      //Print numbers from 1 to 10
      System.out.println("Printing numbers from 1 to 10");
      printNums();


      //Print numbers from 10 to 1
      System.out.println("Printing numbers from 10 to 1");
      printNumsBackwards();


      //Print odd numbers from 1 to 20
      System.out.println("Printing odd numbers from 1 to 20");
      printOddNums();


      //Print even numbers from 1 to 20
      System.out.println("Printing even numbers from 1 to 20");
      printEvenNums();


      //Get number from user and print numbers in
      //   descending order down to 1
      System.out.printf("Printing numbers in descending order ");
      System.out.println("based on your input ");
      System.out.print("Enter a starting number please: ");
      number = keyboard.nextInt();
      printFromUserInput(number);

      //Print sum of values from 1 to 10
      System.out.println("Printing sum of numbers from 1 to 10");
      printsumOfNums(10);

      //Prompt user for an entered value
      //Print sum of values from entered value to 1
      System.out.print("Printing sum of numbers from entered value ");
      System.out.println("to 1");
      System.out.print("Enter a another starting number please: ");
      number = keyboard.nextInt();
      printsumOfNums(number);

      //Print strings of '*' characters with the same length 
      System.out.println("Printing a string of asterisk characters");
      printStars("Same");

      //Print strings of '*' characters whose length increases
      //   by 1 each line. And it is left justified.
      System.out.print("Printing a string of asterisk characters ");
      System.out.println("and is left justified");
      printStars("Left");

      //Print strings of '*' characters whose length increases
      //   by 1 each line. And it is right justified.
      System.out.print("Printing a string of asterisk characters ");
      System.out.println("and is right justified");
      printStars("Right");

      //Prompt user for an integer and calculate the factorial
      System.out.println("Printing factorial for an entered value ");
      System.out.print("Enter a another starting number please: ");
      number = keyboard.nextInt();
      printfactorial(number); 
   }

   //Prints numbers from 1 to 10
   static void printNums() {
      for ( int i = 1; i <= 10; i++) {
         System.out.printf(" %s",i);
      }
      System.out.println("\n");
   }

   //Prints numbers from 10 to 1
   static void printNumsBackwards() {
      for ( int i = 10; i >= 1; i--) {
         System.out.printf(" %s",i);
      }
      System.out.println();
   }

   //Print odd numbers from 1 to 20
   static void printOddNums() {
      for ( int i = 1; i <= 20; i++) {
         if (i%2 > 0) {
            System.out.printf(" %s",i);
         }
      }
      System.out.println();
   }

   //Print odd numbers from 1 to 20
   static void printEvenNums() {
      for ( int i = 1; i <= 20; i++) {
         if (i%2 == 0) {
            System.out.printf(" %s",i);
         }
      }
      System.out.println();
   }

   //Get starting number from user and print numbers
   //   numbers in descending order to 1
   static void printFromUserInput(int num) {
      for ( int i = num; i >= 1; i--) {
         System.out.printf(" %s",i);
      }
      System.out.println();
   }

   //Printing sum of numbers from 1 to upper limit
   //   upper limit is passed in as parameter
   static void printsumOfNums(int end) {
      int sum = 0;
      for ( int i = 1; i <= end; i++) {
         sum += i;
      }
      if (end == 10) {
         System.out.printf("The sum of numbers from 1 to 10 is %s",sum);
      } else {
         System.out.printf("The sum of numbers from %s to 1 is %s",end,sum);
      }
      System.out.println();
   }

   //Printing strings of stars based on pattern provided as parameter
   static void printStars(String pattern) { 
      String starStr = "";
      if ( pattern.equals("Same")) {
         starStr = "**********";
         for (int i = 1; i < 5; i++) {
            System.out.println(starStr);
         }
      } else if (pattern.equals("Left")) {
        for (int i = 1; i <= 5; i++) {
           starStr += "*";
           System.out.println(starStr);
        }  
      } else {
        //Asterisk will be right justified
        for (int i = 1; i <= 5; i++) {
           starStr += "*";
           System.out.printf("%6s\n",starStr);
        }  
      }
      System.out.println();
   }

   //Printing factorial for number passed in as parameter
   static void printfactorial(int number) {
      int factorialValue = 1;
      for ( int i = number; i >= 1; i--) {
         factorialValue *= i;
      }
      System.out.printf("The factorial value for %s is %s",number,factorialValue);
      System.out.println();
   }
}
