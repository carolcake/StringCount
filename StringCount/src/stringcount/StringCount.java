/* Caroline Hsu - 11/02/2020
This program will prompt the user for a sentence and read it. Then, it will ask 
the user if they want to count for words or characters. Next, it will calculate
words or characters based on the user's response and print the sentence and 
computation back to the user. */
package stringcount;

// import your scanner
import java.util.Scanner;
public class StringCount
{
  public static void main(String[] args)
  {
    // declare variables and a variable of type Scanner
    String sentence;
    int charCount;
    int wordCount = 1;
    final int UNIT = 1;
    Scanner kb = new Scanner(System.in);
    String response;

    // Prompt the user to enter a sentence and read it
    System.out.print("Enter a sentence: ");
    sentence = kb.nextLine();
    // prompt the user to see what to calculate (words or characters)
    System.out.println("Would you like to calculate words or characters?");
    response = kb.nextLine();
    // trim the sentence for any extra white spaces
    sentence = sentence.trim();
    
    // immediately assign character count for the sentence length so it is not
    // in a coding block that won't be declared for other areas
    charCount = sentence.length();
    // start an if statement for if the answer is characters (ignore case)
    if (response.equalsIgnoreCase("characters"))
    {
      // print the amount of characters in the sentence for the user
      System.out.println("The amount in characters in your sentence is: "
                           + charCount);
      System.out.println("Your sentence is: " + sentence);
    }

    // for if the response is words (ignore case)
    else if (response.equalsIgnoreCase("words"))
    {
      // start a for loop that initializes the counter at 0 and continues
      // to add one to the counter as it goes through the char count
      for (int counter = 0; counter <= charCount - UNIT; counter++)
      {
        // starts the if statement for if there is a space
        if (sentence.charAt(counter) == ' ')
        {
          // if there is a space, add one to the word count
          wordCount++;
          // however, start a while loop for if there are excessive spaces
          while (sentence.charAt(counter) == ' ')
          {
            // this while loop will go forward and add one to the counter to
            // check for more spaces and will exit out once there's a character 
            counter++;
          }
        }
      }
      // print the sentence and amount of words in your sentence for user
      System.out.println("Your sentence is: " + sentence);
      System.out.println("The amount of words in your sentence is: "
                           + wordCount);
    }
  }
}
